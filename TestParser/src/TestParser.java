import java.io.File;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


public class TestParser {

	
	public static void main(String[] args) throws Exception, SAXException 
	{
		File file = new File("image_of_the_day.xml");
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		RssHandler handler=new RssHandler();
		parser.parse(file, handler);
	}

}

