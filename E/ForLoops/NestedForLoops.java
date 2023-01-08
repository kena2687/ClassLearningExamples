package ClassLearningExamples.E.ForLoops;

public class NestedForLoops {

    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
/*
i=1 1<=3 j=1 1<=3 1 1 1+1=2
         j=2 2<=3 1 2 2+1=3
         j=3 3<=3 1 3 3+1=4
         j=4 4<=3
i++ 1+1=2
i=2 2<=3 j=1 1<=3 2 1 1+1=2
         j=2 2<=3 2 2 2+1=3
         j=3 3<=3 2 3 3+1=4
         j=4 4<=3
i++ 2+1=3
i=3 3<=3 j=1 1<=3 3 1 1+1=2
         j=2 2<=3 3 2 2+1=3
         j=3 3<=3 3 3 3+1=4
         j=4 4<=3
i++ 3+1=4
i=4 4<=3





 */