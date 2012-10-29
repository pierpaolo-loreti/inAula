package com.example.immagininasa;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class RssHandler extends DefaultHandler {
	boolean inTitle = false;
	String title= null;
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("inizio documento");
	}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("fine documento");
	}
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		System.out.println("inizio elemento:"+qName);
		if(qName.equals("title")){
			inTitle=true;
		}
		for (int i = 0; i < attributes.getLength(); i++){
			System.out.println("attributo: "+attributes.getQName(i)+" valore: "+attributes.getValue(i));
		}
	
	}
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		System.out.println("fine elemento:"+qName);
		if(qName.equals("title")){
			inTitle=false;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String s = new String (ch, start, length);
		System.out.println("testo:"+s);
		if (inTitle){
			title=s;
		}
	}
}
