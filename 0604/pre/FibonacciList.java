package pre;

import java.util.ArrayList;

public class FibonacciList{
    protected void run(String[] args){
        // 何項目まで求めるか．
        Integer maxIndex = getArgumentSize(args);

        ArrayList<Integer> list = getFibonacciList(maxIndex);
        System.out.println(list);
    }

    private Integer getArgumentSize(String[] args){
        if (args.length <= 0) return 10;
        return Integer.valueOf(args[0]);
    }

    private ArrayList<Integer> getFibonacciList(Integer index){
        ArrayList<Integer> list = new ArrayList<>();
        for (int counter = 1; counter <= index; counter++) {
            if(counter == 1 || counter == 2){
                list.add(1);
            }
            else{
                Integer number1 = list.get(counter-3);
                Integer number2 = list.get(counter-2);
                list.add(number1+number2);
            }
        }
        return list;
    }
}