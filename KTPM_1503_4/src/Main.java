public class Main {
    public static void main(String[] args) {
        // Dữ liệu XML
        String xmlInput = "<note><to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend!</body></note>";
        XMLData xmlData = new XMLData(xmlInput);

        // Tạo adapter
        DataAdapter adapter = new DataAdapter();

        // Chuyển đổi XML sang JSON
        JSONData jsonData = adapter.toJSON(xmlData);

        // Sử dụng dịch vụ JSON
        JSONService jsonService = new JSONService();
        jsonService.process(jsonData);

        // Chuyển đổi JSON trở lại XML
        XMLData convertedBackToXML = adapter.toXML(jsonData);

        // Sử dụng dịch vụ XML
        XMLService xmlService = new XMLService();
        xmlService.process(convertedBackToXML);
    }
}