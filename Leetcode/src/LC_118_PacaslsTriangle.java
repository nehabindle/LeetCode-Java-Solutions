package LC_118_PacaslsTriangle;

import java.util.ArrayList;
import java.util.List;

public class LC_118_PacaslsTriangle {
	public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    
// List<Integer> temp = new ArrayList<>();
  
  //Edge case
  if(numRows<=0)
  {
      return result;
  }
  
  for(int i=0;i<numRows;i++)
  {
      List<Integer> t1 = new ArrayList<>();
      
      if(i==0){
          t1.add(1);
          result.add(t1);
      }
      else
      {
           List<Integer> t2 = result.get(i-1);
         // System.out.println(t2);
          for(int j=0;j<=t2.size();j++)
          {
              if(j==0)
              {
                  t1.add(t2.get(j));
              }
              else if(j>0 && j<t2.size()){
                  t1.add(t2.get(j-1)+t2.get(j));
              }
              else
              {
                  t1.add(t2.get(t2.size()-1));
              }
          }
          result.add(t1);
      }
  }
return result; 
}
	public static void main(String[] args) {
		LC_118_PacaslsTriangle obj = new LC_118_PacaslsTriangle();
		System.out.println(obj.generate(5));
		// TODO Auto-generated method stub

	}

}
