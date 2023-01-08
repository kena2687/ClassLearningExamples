package ClassLearningExamples.K.Constructors;

public class ConstParameter {
    int modelYear;
    String modelName;

    ConstParameter (int Year, String Name){
        modelYear = Year;
        modelName = Name;

    }


    public static void main(String[] args) {
        ConstParameter constParameter = new ConstParameter(2022,"BMW");
        System.out.println(constParameter.modelYear+ " " +constParameter.modelName);
    }
}
