/*******************************************************************************
 * Copyright (c) 2005-2017 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/
package com.eco.bio7.reditor.actions;

import java.io.File;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import com.eco.bio7.util.Util;

public class OpenFileCreateSourceTemplate {
	public IWorkbenchWindow window;

	public OpenFileCreateSourceTemplate(IDocument doc, int offset, int length) {

		FileDialog fd = new FileDialog(Util.getShell(), SWT.MULTI);
		fd.setText("Open");

		/* For multiple extensions for one filetype, semicolon can be used! */
		String[] filterExt = { "*.*", "*.RData", "*.txt", "*.csv", "*.xls", "*.xlsx", "*.json", "*.xml", "*.sav",
				"*.dta", "*.syd", "*.arff", "*.mat", "*.mtp", "*.dbf", "*.tif;*.*", "*.shp;*.*" };
		fd.setFilterExtensions(filterExt);

		String selected = fd.open();

		if (fd.getFileNames().length > 1) {

			String[] names = fd.getFileNames();
			StringBuffer buf = new StringBuffer();
			buf.append("dataFiles <- c(");
			for (int i = 0, n = names.length; i < n; i++) {

				if (i < n - 1) {
					buf.append("\"");
					buf.append(fd.getFilterPath().replace("\\", "/"));
					buf.append("/");
					buf.append(names[i]);
					buf.append("\"");
					buf.append(",");
				} else {
					buf.append("\"");
					buf.append(fd.getFilterPath().replace("\\", "/"));
					buf.append("/");
					buf.append(names[i]);
					buf.append("\"");
				}
			}
			buf.append(")");
			try {
				doc.replace(offset, length, buf.toString());
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else {

			if (selected != null) {
				selected = selected.replace("\\", "/");
				String fileNameTemp = FilenameUtils.removeExtension(fd.getFileName());
				String fileWithoutExt = fd.getFilterPath() + File.separator + fileNameTemp;
				fileWithoutExt = fileWithoutExt.replace("\\", "/");
				String dirPath = fd.getFilterPath().replace("\\", "/");
				;
				try {
					int selFilter = fd.getFilterIndex();
					switch (selFilter) {
					case 0:
						doc.replace(offset, length, selected);
						break;
					case 1:
						doc.replace(offset, length, "dataTxt <- load(\"" + selected + "\")");
						break;
					case 2:
						doc.replace(offset, length, "dataTable <- read.table(\"" + selected + "\",header = FALSE)");
						break;
					case 3:
						doc.replace(offset, length, "dataCsv <- read.csv(\"" + selected + "\",header = FALSE)");
						break;
					case 4:
						doc.replace(offset, length, "library(XLConnect);\ndataExcel <- readWorksheetFromFile(\""
								+ selected + "\",sheet=1)");
						break;
					case 5:
						doc.replace(offset, length,
								"library(XLConnect);dataExcel <- readWorksheetFromFile(\"" + selected + "\",sheet=1)");
						break;
					case 6:
						doc.replace(offset, length, "library(rjson);dataJson <- fromJSON(file =\"" + selected + "\")");
						break;
					case 7:
						doc.replace(offset, length, "library(XML);dataXml <- xmlTreeParse(\"" + selected + "\")");
						break;
					case 8:
						doc.replace(offset, length, "library(foreign);dataSpss <- read.spss(\"" + selected
								+ "\",to.data.frame=TRUE,use.value.labels=FALSE)");
						break;
					case 9:
						doc.replace(offset, length, "library(foreign);dataStata <- read.dta(\"" + selected + "\")");
						break;
					case 10:
						doc.replace(offset, length,
								"library(foreign);dataSystat <- read.sysstat(\"" + selected + "\")");
						break;
					case 11:
						doc.replace(offset, length, "library(foreign);dataWeka <- read.arff(\"" + selected + "\")");
						break;
					case 12:
						doc.replace(offset, length, "library(foreign);dataOctave <- read.octave(\"" + selected + "\")");
						break;
					case 13:
						doc.replace(offset, length, "library(foreign);dataFile <- read.mtp(\"" + selected + "\")");
						break;
					case 14:
						doc.replace(offset, length,
								"library(foreign);dataDbf <- read.dbf(\"" + selected + "\",as.is = FALSE)");
						break;
					case 15:
						doc.replace(offset, length, "library(rgdal);dataGdal <- readGDAL(\"" + selected + "\")");
						break;
					case 16:
						doc.replace(offset, length, "library(rgdal);dataGdal <- readOGR(\"" + selected + "\")");
						break;

					default:
						break;
					}

				} catch (BadLocationException e) {

					e.printStackTrace();
				}

			}
		}

	}
}