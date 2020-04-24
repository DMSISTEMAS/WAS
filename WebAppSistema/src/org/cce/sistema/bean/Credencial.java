package org.cce.sistema.bean;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.cce.sistema.dao.Conexion;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

@SuppressWarnings("deprecation")
public class Credencial extends Conexion {

	@SuppressWarnings({ "unchecked" })
	public void getCredencial(String ruta, String ID) {
		this.Conectar();

		@SuppressWarnings("rawtypes")
		Map parameters = new HashMap();
		parameters.put("ID", ID);

		try {
			File file = new File(ruta);
			HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance()
					.getExternalContext().getResponse();

			httpServletResponse.setDateHeader("Expires", 0);
			httpServletResponse.setContentType("application/PDF");

			JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, this.getCon());

			@SuppressWarnings({ "rawtypes" })
			JRExporter jrExporter = null;
			jrExporter = new JRPdfExporter();
			jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			jrExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, httpServletResponse.getOutputStream());

			if (jrExporter != null) {
				try {
					jrExporter.exportReport();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (JRException | IOException e) {
			e.printStackTrace();
		} finally {
			if (this.getCon() != null) {
				try {
					this.Cerrar();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
