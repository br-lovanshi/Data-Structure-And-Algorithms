
class Documents {
    protected String data;

    Documents(String data) {
        this.data = data;
    }

    void open() {
        System.out.println(data.substring(0, Math.min(data.length(), 20)) + "...");
    }

    void save(String data) {
        System.out.println("Document saved/updated successfully.");
        this.data = data;
    }

    String getData() {
        return this.data;
    }
}

class ReadOnlyDocument extends Documents {

    ReadOnlyDocument(String data) {
        super(data);
    }

    @Override
    public void save(String data) {
        throw new UnsupportedOperationException("Read only document");
    }

}

class DocumentProcessor {
    void processAndSave(Document document, String additionalInfo) {
        if (!(document instanceof EditDocument editable)) {
            throw new IllegalArgumentException("Document is read only.");
        }

        document.open();
        System.out.println("Document open.");


        String currentData = document.getData();
        String updatedData = currentData + " processed | " + additionalInfo;
        editable.save(updatedData);

    }

    void process(Document document){
        document.open();
        System.out.println("Document open.");

    }
}

interface Document {
    void open();

    String getData();
}

class ReadOnlyDocuments implements Document{

    protected String data;

    ReadOnlyDocuments(String data){
        this.data = data;
    }

    @Override
    public void open() {
        System.out.println(this.data);
    }

    @Override
    public String getData() {
        return this.data;
    }

    public void preview(){
        System.out.println(this.data.substring(0, Math.min(20, this.data.length())));
    }
}
interface EditDocument {
    void save(String data);
}

class EditableDocument implements Document, EditDocument {

    protected String data;

    EditableDocument(String data){
        this.data = data;
    }

    @Override
    public void save(String data) {
        this.data = data;
    }

    @Override
    public void open() {
        System.out.println(this.data);
    }

    @Override
    public String getData() {
        return this.data;
    }
}

public class LiskowSubstitutePrincipleRev {
    public static void main(String[] args) {
//        normal document
        Document readOnly = new ReadOnlyDocuments("This is the new document which is a general notification about study, career, health.");
        DocumentProcessor documentProcessor = new DocumentProcessor();
        documentProcessor.process(readOnly);

        // read only document
        try {
            EditableDocument readWrite = new EditableDocument("This is the very confidential document of users financial report");
            documentProcessor.processAndSave(readWrite, "Reviewed by admin");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

// Child class should be substitute of parent calss, if we use child class instead of parents then it should work.