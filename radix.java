import java.util.ArrayList;
public class radix{
  public static void main (String[] args){
  int toSort[] = {1552,6634,4437,3421,2362,4723000,330,3087,1147,8476,8737,8279,1056,7630,1519,722,7661,1639,7402,5308,1374,6121,814,3099,5636,6017,1155,7517,4344,6246,8155,1105,887,5811,5483,8932,2185,6688,3880,4097,8465,796,8717,1319,702,2980,7883,9841,75,127,77,920,986,2645,5852,8519,9988,8889,9267,5157,5713,8060,8195,6514,619,4872,1728,2255,3944,4744,3133,4194,5366,4300,6064,1261,4896,8660,5885,835,3920,8650,6745,3436,4343,5834,5978,8499,2269,945,2622,5391,4860,2497,5844,7243,4134,1863,6267,290};
  System.out.println("Unsorted list of numbers:");
  for (int x = 0; x<toSort.length; x++){
    if(x%20 == 0){
      System.out.println("");
    }
   System.out.print(toSort[x]);
   System.out.print(",");
  }
  ArrayList<Integer> arrayZero =  new ArrayList<Integer>();
  ArrayList<Integer> arrayOne =  new ArrayList<Integer>();
  ArrayList<Integer> arrayTwo =  new ArrayList<Integer>();
  ArrayList<Integer> arrayThree =  new ArrayList<Integer>();
  ArrayList<Integer> arrayFour =  new ArrayList<Integer>();
  ArrayList<Integer> arrayFive =  new ArrayList<Integer>();
  ArrayList<Integer> arraySix =  new ArrayList<Integer>();
  ArrayList<Integer> arraySeven =  new ArrayList<Integer>();
  ArrayList<Integer> arrayEight =  new ArrayList<Integer>();
  ArrayList<Integer> arrayNine =  new ArrayList<Integer>();
  int cycle = 10;
  boolean check = true;
  while(check == true){
   int digit = cycle / 10;
   for(int x = 0; x<toSort.length; x++){
    if((toSort[x]%cycle)/digit == 0){
     arrayZero.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 1){
     arrayOne.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 2){
     arrayTwo.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 3){
     arrayThree.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 4){
     arrayFour.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 5){
     arrayFive.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 6){
     arraySix.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 7){
     arraySeven.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 8){
     arrayEight.add(toSort[x]);
    }
    if((toSort[x]%cycle)/digit == 9){
     arrayNine.add(toSort[x]);
    }
   }
   int sorted = 0;
   if(arrayZero.size() == toSort.length){
       check = false;
   }
   while(arrayZero.size() > 0){
    toSort[sorted] = arrayZero.get(0);
    arrayZero.remove(0);
    sorted ++;
   }
   while(arrayOne.size() > 0){
    toSort[sorted] = arrayOne.get(0);
    arrayOne.remove(0);
    sorted ++;
   }
   while(arrayTwo.size() > 0){
    toSort[sorted] = arrayTwo.get(0);
    arrayTwo.remove(0);
    sorted ++;
   }
   while(arrayThree.size() > 0){
    toSort[sorted] = arrayThree.get(0);
    arrayThree.remove(0);
    sorted ++;
   }
   while(arrayFour.size() > 0){
    toSort[sorted] = arrayFour.get(0);
    arrayFour.remove(0);
    sorted ++;
   }
   while(arrayFive.size() > 0){
    toSort[sorted] = arrayFive.get(0);
    arrayFive.remove(0);
    sorted ++;
   }
   while(arraySix.size() > 0){
    toSort[sorted] = arraySix.get(0);
    arraySix.remove(0);
    sorted ++;
   }
   while(arraySeven.size() > 0){
    toSort[sorted] = arraySeven.get(0);
    arraySeven.remove(0);
    sorted ++;
   }
   while(arrayEight.size() > 0){
    toSort[sorted] = arrayEight.get(0);
    arrayEight.remove(0);
    sorted ++;
   }
   while(arrayNine.size() > 0){
    toSort[sorted] = arrayNine.get(0);
    arrayNine.remove(0);
    sorted ++;
   }
   cycle = cycle * 10;
   
  }
  System.out.println("\n\nSorted list of numbers:");
  for (int x = 0; x<toSort.length; x++){
    if(x%20 == 0){
      System.out.println("");
    }
   System.out.print(toSort[x]);
   System.out.print(",");
  }
}
}