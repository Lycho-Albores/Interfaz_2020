
package cliente;

import enums.EndPoint;
import enums.SendMode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConsumoCliente {
    
    private String link = null;
    private URL url = null;
    private HttpURLConnection cn = null;
    private DocumentBuilder builder = null;
    private Document doc = null;
    private Element root = null;
    private NodeList nodes = null;
    
    public Object[][] lista(EndPoint endpoint){
        Object[][] datos = null;
        String tipoEndpoint = "";
        
        try {
            link = "http://localhost:8085/BancoREST/servicios/";
            
            if(endpoint == EndPoint.BANCOS){
                link += "bancos/";
                tipoEndpoint = "banco";
            }
            else if(endpoint == EndPoint.CLIENTES){
                link += "clientes/";
                tipoEndpoint = "cliente";
            }
            else if(endpoint == EndPoint.CUENTAS){
                link += "cuentas/";
                tipoEndpoint = "cuenta";
            }
            else if(endpoint == EndPoint.MOVIMIENTOS){
                link += "movimientos/";
                tipoEndpoint = "movimiento";
            }
            else if(endpoint == EndPoint.TIPOCUENTAS){
                link += "Tipo_de_cuenta/";
                tipoEndpoint = "tipocuenta";
            }
            else if(endpoint == EndPoint.TIPOTRANSACCIONES){
                link += "transacciones/";
                tipoEndpoint = "tipotransaccion";
            }
            else if(endpoint == EndPoint.USUARIOS){
                link += "usuarios/";
                tipoEndpoint = "usuario";
            }
            else if(endpoint == EndPoint.USUARIOCUENTA){
                link += "usuario_cuenta/";
                tipoEndpoint = "cuenta";
            }
            
            link += "lista";
            url = new URL(link);
            cn = (HttpURLConnection) url.openConnection();
            cn.setDoOutput(true);
            cn.setRequestMethod("GET");
            cn.setRequestProperty("content-type", "application/xml");
            
            if(!(cn.getResponseCode()==200)){
                throw new RuntimeException("Http error: "+cn.getResponseCode()+"-"+cn.getResponseMessage());
            }
            
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            doc = builder.parse(cn.getInputStream());
            root = doc.getDocumentElement();
            nodes = root.getElementsByTagName(tipoEndpoint);
            datos = new Object[nodes.getLength()][];
            
            for(int i=0; i<nodes.getLength(); i++){
                NodeList row = nodes.item(i).getChildNodes();
                datos[i] = new Object[row.getLength()];
                datos[i][0] = nodes.item(i).getAttributes().item(0).getTextContent();
                
                for(int j=0; j<row.getLength(); j++){
                    NodeList column = row.item(j).getChildNodes();
                    
                    for(int node = 0; node<column.getLength(); node++){
                        datos[i][j] = column.item(node).getTextContent();
                    }
                }
            }
            
            int nulos = 0;
            for(int i=0; i<datos[0].length; i++){
                if(datos[0][i]==null){
                    nulos++;
                }
            }
            
            if(nulos>0){
                Object[][] aux = new Object[datos.length][datos[0].length-nulos];
                for(int i=0; i<datos.length; i++){
                    int pos = 0;
                    for(int j=0; j<datos[i].length; j++){
                        if(!(datos[i][j]==null)){
                            aux[i][pos]=datos[i][j];
                            pos++;
                        }
                    }
                }
                datos = aux;
            }
            
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        return (datos);
    }
    
    public int guardarBanco(SendMode mode, int idbanco, String nombre, String sucursal, String direccion, int opcion){
        try {
            String xml = "";
            OutputStream os = null;
            BufferedReader br = null;
            link = "http://localhost:8085/BancoREST/servicios/bancos/";
            
            if(mode == SendMode.QUERY_STRING){
                link += "guardar_qry/" + idbanco + "/";
                link += nombre + "/" + sucursal + "/";
                link += direccion + "/" + opcion;
                link = link.replaceAll(" ", "%20");
            }
            else{
                link += "guardar_XML";
            }
            
            url = new URL(link);
            cn = (HttpURLConnection) url.openConnection();
            cn.setDoOutput(true);
            
            if(mode == SendMode.QUERY_STRING){
                cn.setRequestMethod("GET");
                cn.setRequestProperty("content-type", "application/text");
                if(!(cn.getResponseCode()==200)){
                    throw new RuntimeException("Http error: "+cn.getResponseCode()+"-"+cn.getResponseMessage());
                }
                br = new BufferedReader(new InputStreamReader(cn.getInputStream()));
                idbanco = Integer.valueOf(br.readLine());
            }
            else{
                cn.setRequestMethod("PUT");
                cn.setRequestProperty("content-type", "application/xml");
                
                xml += "<banco id=\""+idbanco+"\">";
                xml += "<nombre>"+nombre+"</nombre>";
                xml += "<sucursal>"+sucursal+"</sucursal>";
                xml += "<direccion>"+direccion+"</direccion>";
                xml += "<opcion>"+opcion+"</opcion>";
                xml += "</banco>";
                os = cn.getOutputStream();
                os.write(xml.getBytes());
                os.flush();
                if(!(cn.getResponseCode()==200)){
                    throw new RuntimeException("Http error: "+cn.getResponseCode()+"-"+cn.getResponseMessage());
                }
                DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                Document doc = builder.parse(cn.getInputStream());
                Element root = doc.getDocumentElement();
                NodeList nodes = root.getElementsByTagName("id");
                
                idbanco = Integer.valueOf(nodes.item(0).getTextContent());
            }
            
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        return (idbanco);
    }
    
}
