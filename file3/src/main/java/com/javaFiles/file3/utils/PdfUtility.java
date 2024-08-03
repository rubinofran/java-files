package com.javaFiles.file3.utils;

import java.util.Map;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/views/index")
public class PdfUtility extends AbstractPdfView {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // In browser: http://localhost:8010/file3/controller-route/?format=pdf
    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.info("\n\nAccessing the PDF view index\n");

        @SuppressWarnings("unchecked")
        List<String> myList = (List<String>) model.get("list");
        
        PdfPTable myTable = new PdfPTable(2); // Numer of columns
        myList.forEach(item ->{
            myTable.addCell(item);            // Column number 1
            myTable.addCell(item);            // Column number 2  
        });

        document.add(myTable);
    }
    
}
