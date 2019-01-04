package com.home.xml;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;

public class XmlParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(XmlParser.class);

    public boolean parse(String file1, String file2) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(file1));
            String currentPath = "";
            while (xmlEventReader.hasNext()) {
                XMLEvent event = xmlEventReader.nextEvent();
                switch(event.getEventType()) {
                    case XMLStreamConstants.START_ELEMENT:
                        LOGGER.debug("START_ELEMENT event {}, location = {}", event, event.getLocation());
                        if (event.isStartDocument() && StringUtils.isNoneBlank(event.toString())) {
                            currentPath = event.toString();
                        }
                        if (event.isStartElement() && StringUtils.isNoneBlank(event.toString())) {
                            currentPath += event;
                        }
                        LOGGER.debug("currentPath={}", currentPath);
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        LOGGER.debug("CHARACTERS event {}, location = {}", event, event.getLocation());
                        if (event.isCharacters() && StringUtils.isNoneBlank(event.toString())) {
                            currentPath += event;
                        }
                        LOGGER.debug("currentPath={}", currentPath);
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        LOGGER.debug("END_ELEMENT event {}, location = {}", event, event.getLocation());
                        LOGGER.debug("currentPath={}", currentPath);
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}

