package digital.inovation.one.utils.operacoes;


import digital.inovation.one.utils.operacoes.Interno.DivHelper;
import digital.inovation.one.utils.operacoes.Interno.MultHelper;
import digital.inovation.one.utils.operacoes.Interno.SubHelper;
import digital.inovation.one.utils.operacoes.Interno.SumHelper;

public class calculadora {
    private DivHelper divHelper;
    private MultHelper multHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;

   public calculadora(){
       divHelper = new DivHelper();
       multHelper = new MultHelper();
       sumHelper = new SumHelper();
       subHelper = new SubHelper();

   }

   public int div(int a, int b){
       return divHelper.execute(a, b);

   }

   public int mult(int a, int b){
       return multHelper.execute(a, b);
   }

   public int sum(int a, int b){
       return subHelper.execute(a, b);
   }

   public int sub(int a, int b){
       return subHelper.execute(a, b);
   }
}
