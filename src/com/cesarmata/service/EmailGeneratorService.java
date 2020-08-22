package com.cesarmata.service;

import java.io.*;
import java.util.Date;

import java.text.SimpleDateFormat;

/**
 * @author Cesar Mata.
 *
 */
public class EmailGeneratorService {
	
	public void createTemplate(String cliente, String encabezado, String seccion, String fuente, String autor, String contenido, String urlFuente, String linkImagen, String tiraje, String adEquivalence) {
		
		String txtHeaderUno = cliente;
		String txtTitleOne = encabezado;
		String txtSection = seccion;
		String txtResource = fuente;
		String txtBy = autor;
		String txtTiraje = tiraje;
		String txtAdEquivalence = adEquivalence;
		String txtContent = contenido;
		String txtUrl = urlFuente;
		String txtLinkImagen = linkImagen;
		SimpleDateFormat date = new SimpleDateFormat("EEEE d MMMM yyyy");
		
		System.out.println(date.format(new Date()));
			
            //define a HTML String Builder
            StringBuilder htmlStringBuilder=new StringBuilder();
            
    		htmlStringBuilder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
    		htmlStringBuilder.append("<html>");
    	    htmlStringBuilder.append("<head><title></title></head>");
    	    htmlStringBuilder.append("<body>");
    	    htmlStringBuilder.append("<div>");
    	    htmlStringBuilder.append("<p><br><strong><font color=\"#000000\" size=\"5\" face=\"Arial, Helvetica, sans-serif\">Monitoreo de Prensa</font></strong>");
    		htmlStringBuilder.append("<br>");
    		htmlStringBuilder.append("<font color=\"#ff0000\"><strong><font size=\"2\" face=\"Arial, Helvetica, sans-serif\">Destacamos del: "+date.format(new Date())+"</font></strong><font size=\"2\" face=\"Arial, Helvetica, sans-serif\"></font></font>");
    		htmlStringBuilder.append("<font size=\"2\" face=\"Arial, Helvetica, sans-serif\"></font></p>");
    		htmlStringBuilder.append("<p><strong><font size=\"3\" face=\"Arial\">"+txtHeaderUno.toUpperCase()+"</font></strong></p>");
// v3.0		htmlStringBuilder.append("<p><font size=\"3\" face=\"Arial\">"+txtTitleOne+" // "+txtResource+" // "+"<strong><font size=\"2\" face=\"Arial\">Sección: </font></strong>"+txtSection+" // Por: "+txtBy+" // "+"<strong><font size=\"2\" face=\"Arial\">Impactos diarios: </font></strong>"+txtTiraje+" // "+"<strong><font size=\"2\" face=\"Arial\">Ad. Equivalence: </font></strong>"+txtAdEquivalence+" // Fecha: "+date.format(new Date())+"</font>");
/* v4.0 */  htmlStringBuilder.append("<p><font size=\"3\" face=\"Arial\">"+txtTitleOne+" // "+txtResource+" // "+"Sección: "+txtSection+" // Por: "+txtBy+" // "+"Impactos diarios: "+txtTiraje+" // "+"Ad value: "+txtAdEquivalence+" // Fecha: "+date.format(new Date())+"</font>");
    		htmlStringBuilder.append("<br>");
    		htmlStringBuilder.append("<font size=\"2\" face=\"Arial, Helvetica, sans-serif\">"+txtContent+"</font>");
    		htmlStringBuilder.append("<br>");
    		htmlStringBuilder.append("<font size=\"2\" face=\"Arial, Helvetica, sans-serif\"><a href=\""+txtUrl+"\" target=\"_blank\">Ver Página Web</a></font>");
    		htmlStringBuilder.append("<br>");
    		
    		htmlStringBuilder.append("<font size=\"2\" face=\"Arial, Helvetica, sans-serif\"><a href=\""+txtLinkImagen+"\" target=\"_blank\">Ver Imagen</a></font>");
    		htmlStringBuilder.append("<br>");
    		
    		htmlStringBuilder.append("</p>");
    		htmlStringBuilder.append("<p>");
    		htmlStringBuilder.append("<hr>");
    		htmlStringBuilder.append("<div align=\"center\"><font size=\"1\" face=\"Verdana, Arial, Helvetica, sans-serif\">Servicio de noticias de Consultores en Monitoreo de Medios.<br>Las Ligas pueden cambiar sin previo aviso por los portales de noticias.</font></div>");
    		htmlStringBuilder.append("</div>");
    		htmlStringBuilder.append("</body>");
    		htmlStringBuilder.append("</html>");
            
            //write html string content to a file
            try {
				WriteToFile(htmlStringBuilder.toString(),"testfile.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
	
    public static void WriteToFile(String fileContent, String fileName) throws IOException {
    	String usuario = System.getProperty("user.name");
    	System.out.println("El usuario del sistema es: " + usuario);
    	File directory = new File("C:\\Users\\"+usuario+"\\Documents\\plantilla");
    	
    	String projectPath = System.getProperty("user.dir");
    	System.out.println("Ruta del archivo: " + projectPath);
    	
    	
    	if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("La carpeta plantilla  fue creada en la ruta: " + directory);
            } else {
                System.out.println("Error al crear directorios");
            }
        }
    	
 		String tempFile = directory + File.separator+fileName;
        File file = new File(tempFile);
        // if file does exists, then delete and create a new file
        if (file.exists()) {
            try {
                File newFileName = new File(directory + File.separator+ "backup_"+fileName);
                file.renameTo(newFileName);
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //write to file with OutputStreamWriter		
        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
        Writer writer=new OutputStreamWriter(outputStream);
        writer.write(fileContent);
        writer.close();
    }
}