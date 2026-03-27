class Hospital
{
    static String departments[] = {
        "Pediatrics",
        "Orthopedics",
        "Neurology",
        "Oncology",
        "Radiology",
        "Emergency",
        "Gastroenterology",
        "Nephrology",
        "Pulmonology"
    };

    public static void getDepartments()
    {   
        System.out.println("get departments invoked : ");
        for(String department : departments){
            System.out.println(department);
        }
        System.out.println("end of the departments");
    }
}