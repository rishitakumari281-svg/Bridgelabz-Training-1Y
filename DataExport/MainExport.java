public class MainExport {

    public static void main(String[] args) {

        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();

        csv.export("Report 2026");
        pdf.export("Report 2026");

        csv.exportToJSON("Report 2026");
        pdf.exportToJSON("Report 2026");
    }
}