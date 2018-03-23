import java.util.ArrayList;

public class Response {
    private String version;
    private String operation;
    private String numOfLines;
    private String responseCode;
    private String responseCodeStr;
    private ArrayList<String> message;

    public Response(){
    }

    public Response(String Version, String Operation, String NumOfLines, String ResponseCode, String ResponseCodeStr, ArrayList<String> responseMessage){
        this.version = Version;
        this.operation = Operation;
        this.numOfLines = NumOfLines;
        this.responseCode = ResponseCode;
        this.responseCodeStr = ResponseCodeStr;
        this.message = responseMessage;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getNumOfLines() {
        return numOfLines;
    }

    public void setNumOfLines(String numOfLines) {
        this.numOfLines = numOfLines;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCodeStr() {
        return responseCodeStr;
    }

    public void setResponseCodeStr(String responseCodeStr) {
        this.responseCodeStr = responseCodeStr;
    }

    public ArrayList<String> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<String> message) {
        this.message = message;
    }

    public String toString()
    {
        if(message.size()>0)
        {
            String msgOutput = "";
            for(String str : message){
                msgOutput +=str+"CRLF";
            }
            return this.getVersion()+" "+this.getOperation()+" "+this.getNumOfLines()+" "+this.getResponseCode()+" "+this.getResponseCodeStr()+"CRLF"
                    +msgOutput;
        }
        else{
            return this.getVersion()+" "+this.getOperation()+" "+this.getNumOfLines()+" "+this.getResponseCode()+" "+this.getResponseCodeStr()+"CRLF";
        }
    }
}