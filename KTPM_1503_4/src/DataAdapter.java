import org.json.JSONObject;
import org.json.XML;

public class DataAdapter {
    // Chuyển đổi XML sang JSON
    public JSONData toJSON(XMLData xmlData) {
        JSONObject jsonObj = XML.toJSONObject(xmlData.getXml());
        return new JSONData(jsonObj.toString());
    }

    // Chuyển đổi JSON sang XML
    public XMLData toXML(JSONData jsonData) {
        JSONObject jsonObj = new JSONObject(jsonData.getJson());
        String xml = XML.toString(jsonObj);
        return new XMLData(xml);
    }
}
