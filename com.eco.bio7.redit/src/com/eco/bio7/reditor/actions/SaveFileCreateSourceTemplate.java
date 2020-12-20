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
import com.eco.bio7.util.Util;

public class SaveFileCreateSourceTemplate {

	public SaveFileCreateSourceTemplate(IDocument doc, int offset, int length) {
		FileDialog fd = new FileDialog(Util.getShell(), SWT.SAVE);
		fd.setText("Save");

		/* For multiple extensions for one filetype, semicolon can be used! */
		String[] filterExt = { "*.*", "*.RData", "*.txt", "*.csv", "*.xls", "*.xlsx", "*.json", "*.xml", "*.sav", "*.dta", "*.syd", "*.arff", "*.mat", "*.dbf", "*.geotiff", "*.shapefile" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();
		if (selected != null) {
			selected = selected.replace("\\", "/");
			String fileNameTemp = FilenameUtils.removeExtension(fd.getFileName());
			String fileWithoutExt = fd.getFilterPath() + File.separator + fileNameTemp;
			fileWithoutExt = fileWithoutExt.replace("\\", "/");
			String dirPath = fd.getFilterPath().replace("\\", "/");

			try {
				int selFilter = fd.getFilterIndex();

				switch (selFilter) {
				case 0:
					doc.replace(offset, length, selected);
					break;
				case 1:
					doc.replace(offset, length, "save.image(file=\"" + selected + "\")");
					break;
				case 2:
					doc.replace(offset, length, "write(x,file=\"" + selected + "\")");
					break;
				case 3:
					doc.replace(offset, length, "write.csv(x,\"file=" + selected + "\",row.names = FALSE)");
					break;
				case 4:
					doc.replace(offset, length, "library(XLConnect);saveWorkbook(wb,\"" + selected + "\")");
					break;
				case 5:
					doc.replace(offset, length, "library(XLConnect);writeWorksheetToFile(\"" + selected + "\",data=x,sheet = \"mySheet\")");
					break;
				case 6:
					doc.replace(offset, length, "library(rjson);toJSON((file =\"" + selected + ",method=\"C\"\")");
					break;
				case 7:
					doc.replace(offset, length, "library(XML);saveXML(doc,file=\"" + selected + "\")");
					break;
				case 8:
					doc.replace(offset, length, "library(foreign);write.foreign(x,\"" + fileWithoutExt + ".txt\",\"" + fileWithoutExt + ".sps\",package=\"SPSS\")");
					break;
				case 9:
					doc.replace(offset, length, "library(foreign);write.foreign(x,\"" + selected + "\")");
					break;
				case 10:
					doc.replace(offset, length, "library(foreign);write.foreign(x,\"" + fileWithoutExt + ".txt\",\"" + fileWithoutExt + ".syd\",package=\"Systat\")");
					break;
				case 11:
					doc.replace(offset, length, "library(foreign);write.arff(x,\"" + selected + "\")");
					break;
				case 12:
					doc.replace(offset, length, "library(R.matlab);writeMat(\"" + selected + "\",x)");
					break;

				case 13:
					doc.replace(offset, length, "library(foreign);write.dbf(x,\"" + selected + "\")");
					break;
				case 14:
					doc.replace(offset, length, "library(rgdal);writeGDAL(sp_grid_object, fname =\"" + fileWithoutExt + ".tif\" , drivername = \"GTiff\", type = \"Float32\")");
					break;
				case 15:
					doc.replace(offset, length, "library(rgdal);writeOGR(sp_poly_object, fname =\"" + dirPath + "\" , driver = \"ESRI Shapefile\")");
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
