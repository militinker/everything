package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    //we will pass the body in multiple formats

    public static String createEmployeePayload(){
        String createEmployeePayload = "{\n" +
                "    \"emp_firstname\": \"belena\",\n" +
                "    \"emp_lastname\": \"baria\",\n" +
                "    \"emp_middle_name\": \"ms\",\n" +
                "    \"emp_gender\": \"F\",\n" +
                "    \"emp_birthday\": \"2009-05-20\",\n" +
                "    \"emp_status\": \"confirmed\",\n" +
                "    \"emp_job_title\": \"engineer\"\n" +
                "}";
        return createEmployeePayload;
    }

    public static String  createEmployeePayloadDynamic(String emp_firstname,
                                                       String emp_lastname,
                                                       String emp_middle_name,
                                                       String emp_gender,
                                                       String emp_birthday,
                                                       String emp_status,
                                                       String emp_job_title){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname",emp_firstname);
        obj.put("emp_lastname",emp_lastname);
        obj.put("emp_middle_name",emp_middle_name);
        obj.put("emp_gender",emp_gender);
        obj.put("emp_birthday",emp_birthday);
        obj.put("emp_status",emp_status);
        obj.put("emp_job_title",emp_job_title);

        return obj.toString();
    }

    public static String updateEmployeePayloadJson(){
        JSONObject obj = new JSONObject();
        obj.put("employee_id","53571A");
        obj.put("emp_firstname","natalia");
        obj.put("emp_lastname","glusco");
        obj.put("emp_middle_name","ms");
        obj.put("emp_gender","M");
        obj.put("emp_birthday","2001-04-22");
        obj.put("emp_status","Probation");
        obj.put("emp_job_title","Manager");
        return obj.toString();
    }
}
