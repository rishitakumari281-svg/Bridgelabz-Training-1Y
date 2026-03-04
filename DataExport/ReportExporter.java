public interface ReportExporter {

    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON: { \"data\": \"" + data + "\" }");
    }
}