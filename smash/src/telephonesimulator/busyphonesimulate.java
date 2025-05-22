
/**.math.*;
/**
 *USER Guide 
 * DO NOT Enter arrival time less than clock value
 * AlsoIn FROM and To field
 *      donot enter new call more than 8 and less than 1.
 * You can handle exceptions and make it more suitable
 * For Educational Purpose
 * @LaxmiBikramBurlakoti
 */
package telephonesimulator;
public class busyphonesimulate extends javax.swing.JFrame {
    
int processed,completed,blocked,busy;
String proces;String complete;String blocke;String bus;String uses;
private int use;String clocks;private int clock;private  int total=clock;String froms;private  int from;String tos;private  int to;String lens;private  int len;String arrivals; private  int arrival;String from3s;private int from3;String from2s;private int from2;String from1s;private int from1;String to1s;private  int to1;String to2s;private  int to2;String to3s;private  int to3;String end1s;private  int end1;String end2s;private  int end2;String end3s;private  int end3;String tf1s;private  int tff1;String tf2s;private  int tff2;String tf3s;private  int tff3;String tf4s;private  int tff4;String tf5s; private  int tff5; String tf6s;private  int tff6;String tf7s;private  int tff7;String tf8s;private  int tff8;
  
public busyphonesimulate() {initComponents();}
public int findNearest(int target, int value1, int value2) {
        
        int diff1 = Math.abs(target - value1);
        int diff2 = Math.abs(target - value2);
        return (diff1 < diff2) ? value1 : value2;
    }
   
 public void down(int fromm,int too){
           //label-1 down to zero--
           if(fromm==1)
           {
               if( too==2)
               {
                   tf1.setText("0");
                   tf2.setText("0");
               }
           
                if(too==3)
                {
                    tf1.setText("0");
                    tf3.setText("0");
                }
                if(too==4)
                {
                    tf1.setText("0");
                    tf4.setText("0");
                }
                if(too==5)
                {
                    tf1.setText("0");
                    tf5.setText("0");
                }
                if(too==6)
                {
                    tf1.setText("0");
                    tf6.setText("0");
                }
                if(too==7)
                {
                    tf1.setText("0");
                    tf7.setText("0");
                }
                if(too==8)
                {
                    tf1.setText("0");
                    tf8.setText("0");
                }
           }
         //label 2
           if(fromm==2)
           {
               if( too==1)
               {
                   tf1.setText("0");
                   tf2.setText("0");
               }
           
                if(fromm==3)
                {
                    tf2.setText("0");
                    tf3.setText("0");
                }
                if(too==4)
                {
                    tf2.setText("0");
                    tf4.setText("0");
                }
                if(too==5)
                {
                    tf2.setText("0");
                    tf5.setText("0");
                }
                if(too==6)
                {
                    tf2.setText("0");
                    tf6.setText("0");
                }
                if(too==7)
                {
                    tf2.setText("0");
                    tf7.setText("0");
                }
                if(too==8)
                {
                    tf2.setText("0");
                    tf8.setText("0");
                }
           }
           //label-3
           if(fromm==3)
           {
               if( too==2)
               {
                   tf3.setText("0");
                   tf2.setText("0");
               }
           
                if(too==1)
                {
                    tf1.setText("0");
                    tf3.setText("0");
                }
                if(too==4)
                {
                    tf3.setText("0");
                    tf4.setText("0");
                }
                if(too==5)
                {
                    tf3.setText("0");
                    tf5.setText("0");
                }
                if(too==6)
                {
                    tf3.setText("0");
                    tf6.setText("0");
                }
                if(too==7)
                {
                    tf3.setText("0");
                    tf7.setText("0");
                }
                if(too==8)
                {
                    tf8.setText("0");
                    tf6.setText("0");
                }
           }
//           label-4
           if(fromm==4)
           {
               if( too==2)
               {
                   tf4.setText("0");
                   tf2.setText("0");
               }
           
                if(too==3)
                {
                    tf4.setText("0");
                    tf3.setText("0");
                }
                if(too==1)
                {
                    tf1.setText("0");
                    tf4.setText("0");
                }
                if(too==5)
                {
                    tf4.setText("0");
                    tf5.setText("0");
                }
                if(too==6)
                {
                    tf4.setText("0");
                    tf6.setText("0");
                }
                if(too==7)
                {
                    tf4.setText("0");
                    tf7.setText("0");
                }
                if(too==8)
                {
                    tf4.setText("0");
                    tf8.setText("0");
                }
           }
//           label-5
           if(fromm==5)
           {
               if( too==2)
               {
                   tf5.setText("0");
                   tf2.setText("0");
               }
           
                if(too==3)
                {
                    tf5.setText("0");
                    tf3.setText("0");
                }
                if(too==4)
                {
                    tf5.setText("0");
                    tf4.setText("0");
                }
                if(too==1)
                {
                    tf1.setText("0");
                    tf5.setText("0");
                }
                if(too==6)
                {
                    tf5.setText("0");
                    tf6.setText("0");
                }
                if(too==7)
                {
                    tf5.setText("0");
                    tf7.setText("0");
                }
                if(too==8)
                {
                    tf5.setText("0");
                    tf8.setText("0");
                }
           }
           //label-6
           if(fromm==6)
           {
               if( too==2)
               {
                   tf6.setText("0");
                   tf2.setText("0");
               }
           
                if(too==3)
                {
                    tf6.setText("0");
                    tf3.setText("0");
                }
                if(too==4)
                {
                    tf6.setText("0");
                    tf4.setText("0");
                }
                if(too==5)
                {
                    tf6.setText("0");
                    tf5.setText("0");
                }
                if(too==1)
                {
                    tf1.setText("0");
                    tf6.setText("0");
                }
                if(too==7)
                {
                    tf7.setText("0");
                    tf6.setText("0");
                }
                if(too==8)
                {
                    tf8.setText("0");
                    tf6.setText("0");
                }  
           }
          if(fromm==7)
           {
               if(too==1)
                {
                    tf1.setText("0");
                    tf7.setText("0");
                }
               if( too==2)
               {
                   tf7.setText("0");
                   tf2.setText("0");
               }
           
                if(too==3)
                {
                    tf7.setText("0");
                    tf3.setText("0");
                }
                if(too==4)
                {
                    tf7.setText("0");
                    tf4.setText("0");
                }
                if(too==5)
                {
                    tf7.setText("0");
                    tf5.setText("0");
                }
                if(too==6)
                {
                    tf7.setText("0");
                    tf6.setText("0");
                }
                
                if(too==8)
                {
                    tf7.setText("0");
                    tf8.setText("0");
                }
           } 
          if(fromm==8)
           {
               if( too==1)
               {
                   tf8.setText("0");
                   tf1.setText("0");
               }
               if( too==2)
               {
                   tf8.setText("0");
                   tf2.setText("0");
               }
           
                if(too==3)
                {
                    tf8.setText("0");
                    tf3.setText("0");
                }
                if(too==4)
                {
                    tf8.setText("0");
                    tf4.setText("0");
                }
                if(too==5)
                {
                    tf8.setText("0");
                    tf5.setText("0");
                }
                if(too==6)
                {
                    tf8.setText("0");
                    tf6.setText("0");
                }
                if(too==7)
                {
                    tf8.setText("0");
                    tf7.setText("0");
                }
                 
           }
       
       }
 public void up(int fromm,int too){
                      //label-1 down to zero--
           if(fromm==1)
           {
               if( too==2)
               {
                   tf1.setText("1");
                   tf2.setText("1");
               }
           
                if(too==3)
                {
                    tf1.setText("1");
                    tf3.setText("1");
                }
                if(too==4)
                {
                    tf1.setText("1");
                    tf4.setText("1");
                }
                if(too==5)
                {
                    tf1.setText("1");
                    tf5.setText("1");
                }
                if(too==6)
                {
                    tf1.setText("1");
                    tf6.setText("1");
                }
                if(too==7)
                {
                    tf1.setText("1");
                    tf7.setText("1");
                }
                if(too==8)
                {
                    tf1.setText("1");
                    tf8.setText("1");
                }
           }
         //label 2
           if(fromm==2)
           {
               if( too==1)
               {
                   tf1.setText("1");
                   tf2.setText("1");
               }
           
                if(too==3)
                {
                    tf2.setText("1");
                    tf3.setText("1");
                }
                if(too==4)
                {
                    tf2.setText("1");
                    tf4.setText("1");
                }
                if(too==5)
                {
                    tf2.setText("1");
                    tf5.setText("1");
                }
                if(too==6)
                {
                    tf2.setText("1");
                    tf6.setText("1");
                }
                if(too==7)
                {
                    tf2.setText("1");
                    tf7.setText("1");
                }
                if(too==8)
                {
                    tf2.setText("1");
                    tf8.setText("1");
                }
           }
           //label-3
           if(fromm==3)
           {
               if( too==2)
               {
                   tf3.setText("1");
                   tf2.setText("1");
               }
           
                if(too==1)
                {
                    tf1.setText("1");
                    tf3.setText("1");
                }
                if(too==4)
                {
                    tf3.setText("1");
                    tf4.setText("1");
                }
                if(too==5)
                {
                    tf3.setText("1");
                    tf5.setText("1");
                }
                if(too==6)
                {
                    tf3.setText("1");
                    tf6.setText("1");
                }
                if(too==7)
                {
                    tf3.setText("1");
                    tf7.setText("1");
                }
                if(too==8)
                {
                    tf3.setText("1");
                    tf8.setText("1");
                }
           }
//           label-4
           if(fromm==4)
           {
               if( too==2)
               {
                   tf4.setText("1");
                   tf2.setText("1");
               }
           
                if(too==3)
                {
                    tf4.setText("1");
                    tf3.setText("1");
                }
                if(too==1)
                {
                    tf1.setText("1");
                    tf4.setText("1");
                }
                if(too==5)
                {
                    tf4.setText("1");
                    tf5.setText("1");
                }
                if(too==6)
                {
                    tf4.setText("1");
                    tf6.setText("1");
                }
                if(too==7)
                {
                    tf4.setText("1");
                    tf7.setText("1");
                }
                if(too==8)
                {
                    tf4.setText("1");
                    tf8.setText("1");
                }
           }
//           label-5
           if(fromm==5)
           {
               if( too==2)
               {
                   tf5.setText("1");
                   tf2.setText("1");
               }
           
                if(too==3)
                {
                    tf5.setText("1");
                    tf3.setText("1");
                }
                if(too==4)
                {
                    tf5.setText("1");
                    tf4.setText("1");
                }
                if(too==1)
                {
                    tf1.setText("1");
                    tf5.setText("1");
                }
                if(too==6)
                {
                    tf5.setText("1");
                    tf6.setText("1");
                }
                if(too==7)
                {
                    tf7.setText("1");
                    tf5.setText("1");
                }
                if(too==8)
                {
                    tf5.setText("1");
                    tf8.setText("1");
                }
           }
           //label-6
           if(fromm==6)
           {
               if( too==2)
               {
                   tf6.setText("1");
                   tf2.setText("1");
               }
           
                if(too==3)
                {
                    tf6.setText("1");
                    tf3.setText("1");
                }
                if(too==4)
                {
                    tf6.setText("1");
                    tf4.setText("1");
                }
                if(too==5)
                {
                    tf6.setText("1");
                    tf5.setText("1");
                }
                if(too==1)
                {
                    tf1.setText("1");
                    tf6.setText("1");
                }
                if(too==7)
                {
                    tf7.setText("1");
                    tf6.setText("1");
                }if(too==8)
                {
                    tf8.setText("1");
                    tf6.setText("1");
                }
           }
           if(fromm==7)
           {
               if(too==1)
                {
                    tf1.setText("1");
                    tf7.setText("1");
                }
               if( too==2)
               {
                   tf7.setText("1");
                   tf2.setText("1");
               }
           
                if(too==3)
                {
                    tf7.setText("1");
                    tf3.setText("1");
                }
                if(too==4)
                {
                    tf7.setText("1");
                    tf4.setText("1");
                }
                if(too==5)
                {
                    tf7.setText("1");
                    tf5.setText("1");
                }
                if(too==6)
                {
                    tf7.setText("1");
                    tf6.setText("1");
                }
                
                if(too==8)
                {
                    tf7.setText("1");
                    tf8.setText("1");
                }
           } 
          if(fromm==8)
           {
               if( too==1)
               {
                   tf8.setText("1");
                   tf1.setText("1");
               }
               if( too==2)
               {
                   tf8.setText("1");
                   tf2.setText("1");
               }
           
                if(too==3)
                {
                    tf8.setText("1");
                    tf3.setText("1");
                }
                if(too==4)
                {
                    tf8.setText("1");
                    tf4.setText("1");
                }
                if(too==5)
                {
                    tf8.setText("1");
                    tf5.setText("1");
                }
                if(too==6)
                {
                    tf8.setText("1");
                    tf6.setText("1");
                }
                if(too==7)
                {
                    tf8.setText("1");
                    tf7.setText("1");
                }
                 
           }
       
       }
    @SuppressWarnings("empty-statement")
public boolean check(){
         if(from==1 && to==2)
          { 
            if(tff1==1 || tff2==1){
               busyy();
             return true;} 
          }
          if(from==1 && to==3)
          { 
            if(tff1==1||tff3==1){
                 busyy();
            return true; }   
          }if(from==1&& to==4)
          { 
            if(tff1==1||tff4==1){
                busyy();
            return true; }  
          }if(from==1&& to==5)
          { 
            if(tff1==1 ||tff5==1){
                 busyy();
            return true; }  
          }if(from==1&& to==6)
          { 
           if(tff1==1||tff6==1){
               busyy();
            return true; }   
          }if(from==1&& to==7)
          { 
           if(tff1==1||tff7==1){
                 busyy();
            return true; }   
          }if(from==1&& to==8)
          { 
           if(tff1==1||tff8==1){
                busyy();
            return true; }   
          }
          
          if(from==2&& to==1)
          { 
            if(tff2==1||tff1==1){
               busyy();
             return true;}  
          }if(from==2&& to==3)
          { 
            if(tff2==1||tff3==1){
                busyy();
             return true;}  
          }if(from==2&& to==4)
          { 
            if(tff2==1||tff4==1){
                 busyy();
             return true;}  
          }if(from==2&& to==5)
          { 
            if(tff2==1||tff5==1){
                busyy();
             return true;}  
          }if(from==2&& to==6)
          { 
            if(tff2==1||tff6==1){
                 busyy();
            return true; }  
          }if(from==2&& to==7)
          { 
            if(tff2==1||tff7==1){
                busyy();
            return true; }  
          }if(from==2&& to==8)
          { 
            if(tff2==1||tff8==1){
                busyy();
            return true; }  
          }
          
          if(from==3&& to==1)
          { 
            if(tff3==1||tff1==1){
                busyy();
             return true;}  
          }if(from==3&& to==2)
          { 
           if(tff3==1||tff2==1){
                busyy();
             return true;}   
          }if(from==3&& to==4)
          { 
            if(tff3==1||tff4==1){
               busyy();
            return true; }  
          }if(from==3&& to==5)
          { 
            if(tff3==1||tff5==1){
                busyy();
            return true; }  
          }if(from==3 &&to==6)
          { 
            if(tff3==1|| tff6==1){
                busyy();
             return true;}  
          }if(from==3 &&to==7)
          { 
            if(tff3==1|| tff7==1){
                busyy();
             return true;}  
          }if(from==3 &&to==8)
          { 
            if(tff3==1|| tff8==1){
                busyy();
             return true;}  
          }
          
          if(from==4&& to==1)
          { 
            if(tff4==1||tff1==1){
                 busyy();
            return true; }  
          }if(from==4&& to==2)
          { 
           if(tff4==1||tff2==1){
                busyy();
             return true;}   
          }if(from==4&& to==3)
          { 
            if(tff4==1||tff3==1){
                 busyy();
            return true; }  
          }if(from==4&& to==5)
          { 
            if(tff4==1||tff5==1){
                busyy();
             return true;}  
          }if(from==4&& to==6)
          { 
            if(tff4==1||tff6==1){
                busyy();
           return true;  }  
          }if(from==4&& to==7)
          { 
            if(tff4==1||tff7==1){
                 busyy();
           return true;  }  
          }if(from==4&& to==8)
          { 
            if(tff4==1||tff8==1){
                 busyy();
           return true;  }  
          }
          
          if(from==5&& to==1)
          { 
           if(tff5==1||tff1==1){
                 busyy();
            return true; }   
          }if(from==5&& to==2)
          { 
            if(tff5==1||tff2==1){
                busyy();
           return true;  }  
          }if(from==5&& to==3)
          { 
            if(tff5==1||tff3==1){
                busyy();
           return true;  }  
          }if(from==5&& to==4)
          { 
            if(tff5==1&&tff4==1){
                busyy();
           return true;  }  
          }if(from==5&& to==6)
          { 
            if(tff5==1||tff6==1){
                busyy();
            return true; }  
          }if(from==5&& to==7)
          { 
            if(tff5==1||tff7==1){
               busyy();
            return true; }  
          }if(from==5&& to==8)
          { 
            if(tff5==1||tff8==1){
               busyy();
            return true; }  
          }
          
          if(from==6&& to==1)
          { 
           if(tff6==1||tff1==1){
              busyy();
            return true; }   
          }if(from==6&& to==2)
          { 
           if(tff6==1||tff2==1){
               busyy();
            return true; }   
          }if(from==6&& to==3)
          { 
            if(tff6==1||tff3==1){
                busyy();
            return true; }  
          }if(from==6&& to==4)
          { 
           if(tff6==1||tff4==1){
                 busyy();
             return true;}   
          } if(from==6&& to==5)
          { 
            if(tff6==1||tff5==1){
                 busyy();
                 return true;
             }  
          } if(from==6&& to==7)
          { 
            if(tff6==1||tff7==1){
                 busyy();
                 return true;
             }  
          } if(from==6&& to==8)
          { 
            if(tff6==1||tff8==1){
                busyy();
                 return true;
             }  
          }
          if(from==7&& to==1)
          { 
           if(tff7==1||tff1==1){
               busyy();
            return true; }   
          }if(from==7&& to==2)
          { 
           if(tff7==1||tff2==1){
                 busyy();
            return true; }   
          }if(from==7&& to==3)
          { 
            if(tff7==1||tff3==1){
                busyy();
            return true; }  
          }if(from==7&& to==4)
          { 
           if(tff7==1||tff4==1){
               busyy();
             return true;}   
          } if(from==7&& to==5)
          { 
            if(tff7==1||tff5==1){
                 busyy();
                 return true;
             }  
          } if(from==7&& to==6)
          { 
            if(tff7==1||tff6==1){
               busyy();
                 return true;
             }  
          } if(from==7&& to==8)
          { 
            if(tff7==1||tff8==1){
                busyy();
                 return true;
             }  
          }
          if(from==8&& to==1)
          { 
           if(tff8==1||tff1==1){
                busyy();
            return true; }   
          }if(from==8&& to==2)
          { 
           if(tff8==1||tff2==1){
                 busyy();
            return true; }   
          }if(from==8&& to==3)
          { 
            if(tff8==1||tff3==1){
                 busyy();
            return true; }  
          }if(from==8&& to==4)
          { 
           if(tff8==1||tff4==1){
                busyy();
             return true;}   
          } if(from==8&& to==5)
          { 
            if(tff8==1||tff5==1){
                 busyy();
                 return true;
             }  
          } if(from==8&& to==7)
          { 
            if(tff8==1||tff7==1){
                 busyy();
                 return true;
             }  
          } if(from==8&& to==6)
          { 
            if(tff8==1||tff6==1){
                 busyy();
                 return true;
             }  
          }
        return false;
        }     
public int findfrom(){
     this.from1s = from1f.getText();
      int from1 = Integer.parseInt(from1s);
        return from1; 
}
public int findto(){
    this.to1s=to1f.getText();
    int to1 = Integer.parseInt(to1s);
        
        return to1;
}
public void busyy(){
    total=arrival;
    clockf.setText(String.valueOf(total));
    busy+=1;
    processed+=1;
    busyf.setText(String.valueOf(busy));
    processedf.setText(String.valueOf(processed));
    clearnewfield();
}
public void clearnewfield(){
        tof.setText("");
        fromf.setText("");
        lenf.setText("");
        arrivalf.setText("");
}
public void shift2to1(){
    this.from2s =from2f.getText();
     from1f.setText(from2s);
    this.to2s =to2f.getText();
    to1f.setText(to2s);
    this.end2s =end2f.getText();
    end1f.setText(end2s);
    from2f.setText("");
    to2f.setText("");
    end2f.setText("");
} 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        maxnof = new javax.swing.JTextField();
        usef = new javax.swing.JTextField();
        clockf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        from3f = new javax.swing.JTextField();
        to3f = new javax.swing.JTextField();
        end3f = new javax.swing.JTextField();
        from2f = new javax.swing.JTextField();
        from1f = new javax.swing.JTextField();
        to1f = new javax.swing.JTextField();
        end1f = new javax.swing.JTextField();
        to2f = new javax.swing.JTextField();
        end2f = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lenf = new javax.swing.JTextField();
        tof = new javax.swing.JTextField();
        fromf = new javax.swing.JTextField();
        arrivalf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        processedf = new javax.swing.JTextField();
        completedf = new javax.swing.JTextField();
        blockedf = new javax.swing.JTextField();
        busyf = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        enter1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busy Call Telephone(021-351)");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("LINES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("1:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("2:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("3:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("4:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("5:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("6:");

        tf2.setText("1");
        tf2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf2.setFocusable(false);
        tf2.setRequestFocusEnabled(false);
        tf2.setVerifyInputWhenFocusTarget(false);
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        tf1.setText("0");
        tf1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf1.setFocusable(false);
        tf1.setRequestFocusEnabled(false);
        tf1.setVerifyInputWhenFocusTarget(false);

        tf3.setText("0");
        tf3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf3.setFocusable(false);
        tf3.setRequestFocusEnabled(false);
        tf3.setVerifyInputWhenFocusTarget(false);

        tf4.setText("1");
        tf4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf4.setFocusable(false);
        tf4.setRequestFocusEnabled(false);
        tf4.setVerifyInputWhenFocusTarget(false);

        tf5.setText("1");
        tf5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf5.setFocusable(false);
        tf5.setRequestFocusEnabled(false);
        tf5.setVerifyInputWhenFocusTarget(false);

        tf6.setText("0");
        tf6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf6.setFocusable(false);
        tf6.setRequestFocusEnabled(false);
        tf6.setVerifyInputWhenFocusTarget(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("7:");

        tf7.setText("1");
        tf7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf7.setFocusable(false);
        tf7.setRequestFocusEnabled(false);
        tf7.setVerifyInputWhenFocusTarget(false);
        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("8:");

        tf8.setText("0");
        tf8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf8.setFocusable(false);
        tf8.setRequestFocusEnabled(false);
        tf8.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf8))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf6))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel1))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        tf2.getAccessibleContext().setAccessibleName("tf2");
        tf1.getAccessibleContext().setAccessibleName("tf1");
        tf3.getAccessibleContext().setAccessibleName("tf3");
        tf4.getAccessibleContext().setAccessibleName("tf4");
        tf5.getAccessibleContext().setAccessibleName("tf5");
        tf6.getAccessibleContext().setAccessibleName("tf6");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("LINKS");

        jLabel9.setText("    IN USE");

        jLabel10.setText("MAX NO.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("CLOCK");

        maxnof.setText("3");
        maxnof.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        maxnof.setFocusable(false);
        maxnof.setRequestFocusEnabled(false);
        maxnof.setVerifyInputWhenFocusTarget(false);
        maxnof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxnofActionPerformed(evt);
            }
        });

        usef.setText("2");
        usef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usef.setFocusable(false);
        usef.setRequestFocusEnabled(false);
        usef.setVerifyInputWhenFocusTarget(false);
        usef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usefActionPerformed(evt);
            }
        });

        clockf.setText("1027");
        clockf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clockf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usef, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(maxnof)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11))
                            .addComponent(clockf, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxnof, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clockf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        maxnof.getAccessibleContext().setAccessibleName("maxnof");
        usef.getAccessibleContext().setAccessibleName("usef");
        clockf.getAccessibleContext().setAccessibleName("clockf");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("FROM");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("TO");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("END");

        from3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        from3f.setFocusable(false);
        from3f.setRequestFocusEnabled(false);
        from3f.setVerifyInputWhenFocusTarget(false);
        from3f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from3fActionPerformed(evt);
            }
        });

        to3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        to3f.setFocusable(false);
        to3f.setRequestFocusEnabled(false);
        to3f.setVerifyInputWhenFocusTarget(false);

        end3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        end3f.setFocusable(false);
        end3f.setRequestFocusEnabled(false);
        end3f.setVerifyInputWhenFocusTarget(false);

        from2f.setText("4");
        from2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        from2f.setFocusable(false);
        from2f.setRequestFocusEnabled(false);
        from2f.setVerifyInputWhenFocusTarget(false);

        from1f.setText("2");
        from1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        from1f.setFocusable(false);
        from1f.setRequestFocusEnabled(false);
        from1f.setVerifyInputWhenFocusTarget(false);

        to1f.setText("5");
        to1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        to1f.setFocusable(false);
        to1f.setRequestFocusEnabled(false);
        to1f.setVerifyInputWhenFocusTarget(false);

        end1f.setText("1053");
        end1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        end1f.setFocusable(false);
        end1f.setRequestFocusEnabled(false);
        end1f.setVerifyInputWhenFocusTarget(false);

        to2f.setText("7");
        to2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        to2f.setFocusable(false);
        to2f.setRequestFocusEnabled(false);
        to2f.setVerifyInputWhenFocusTarget(false);

        end2f.setText("1075");
        end2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        end2f.setFocusable(false);
        end2f.setRequestFocusEnabled(false);
        end2f.setVerifyInputWhenFocusTarget(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel15.setText("CALLS IN PROGRESS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(from3f, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(from2f)
                    .addComponent(from1f)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(to1f, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(to2f, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(to3f, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(end2f, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(end3f)
                    .addComponent(end1f)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(end3f, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(to3f)
                    .addComponent(from3f))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(to2f, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(from2f, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(end2f, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(end1f, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(to1f, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(from1f, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        from3f.getAccessibleContext().setAccessibleName("progfrom3f");
        to3f.getAccessibleContext().setAccessibleName("progto3f");
        end3f.getAccessibleContext().setAccessibleName("progend3f");
        from2f.getAccessibleContext().setAccessibleName("progfrom2f");
        from1f.getAccessibleContext().setAccessibleName("progfrom1");
        to1f.getAccessibleContext().setAccessibleName("progto1f");
        end1f.getAccessibleContext().setAccessibleName("progend1f");
        to2f.getAccessibleContext().setAccessibleName("progto2f");
        end2f.getAccessibleContext().setAccessibleName("progend2f");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel20.setText("ARRIVAL TIME");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel27.setText("TO");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel28.setText("LENGTH");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel29.setText("FROM");

        lenf.setToolTipText("");
        lenf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lenf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenfActionPerformed(evt);
            }
        });

        tof.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tofActionPerformed(evt);
            }
        });

        fromf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fromf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromfActionPerformed(evt);
            }
        });

        arrivalf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        arrivalf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalfActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(arrivalf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fromf)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tof, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lenf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lenf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tof, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(3, 3, 3)
                .addComponent(arrivalf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        lenf.getAccessibleContext().setAccessibleName("newlenf");
        tof.getAccessibleContext().setAccessibleName("newtof");
        fromf.getAccessibleContext().setAccessibleName("newfromf");
        arrivalf.getAccessibleContext().setAccessibleName("arrivaltimef");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel17.setText("CALL COUNTERS");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("PROCESSED");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setText("COMPLETED");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel25.setText("BLOCKED");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel26.setText("BUSY");

        processedf.setText("0");
        processedf.setFocusable(false);
        processedf.setRequestFocusEnabled(false);
        processedf.setVerifyInputWhenFocusTarget(false);

        completedf.setText("0");
        completedf.setFocusable(false);
        completedf.setRequestFocusEnabled(false);
        completedf.setVerifyInputWhenFocusTarget(false);

        blockedf.setText("0");
        blockedf.setFocusable(false);
        blockedf.setRequestFocusEnabled(false);
        blockedf.setVerifyInputWhenFocusTarget(false);

        busyf.setText("0");
        busyf.setFocusable(false);
        busyf.setRequestFocusEnabled(false);
        busyf.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(processedf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24)
                    .addComponent(completedf, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(blockedf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(busyf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel18)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processedf, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(completedf)
                    .addComponent(blockedf)
                    .addComponent(busyf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        processedf.getAccessibleContext().setAccessibleName("progressedf");
        completedf.getAccessibleContext().setAccessibleName("completedf");
        blockedf.getAccessibleContext().setAccessibleName("blockedf");
        busyf.getAccessibleContext().setAccessibleName("busyf");

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jLabel16.setBackground(new java.awt.Color(51, 255, 51));
        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel16.setText("NEXT CALL:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        enter.setBackground(new java.awt.Color(0, 153, 153));
        enter.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        enter.setForeground(new java.awt.Color(255, 255, 255));
        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setBackground(new java.awt.Color(51, 255, 51));
        jLabel31.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 51, 0));
        jLabel31.setText("BUSY CALL PHONE SIMULATION:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        enter1.setBackground(new java.awt.Color(0, 153, 0));
        enter1.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        enter1.setForeground(new java.awt.Color(255, 255, 255));
        enter1.setText("HOME");
        enter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(enter1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 415, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enter1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 555, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void from3fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from3fActionPerformed
        
    }//GEN-LAST:event_from3fActionPerformed

    private void fromfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromfActionPerformed
       
    }//GEN-LAST:event_fromfActionPerformed

    @SuppressWarnings("empty-statement")
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
 
int small;
int f,t;
        //textfields
        this.tf1s=tf1.getText();
        this.tff1 = Integer.parseInt(tf1s);
        this.tf2s=tf2.getText();
        this.tff2 = Integer.parseInt(tf2s);
        this.tf3s=tf3.getText();
        this.tff3 = Integer.parseInt(tf3s);
        this.tf4s=tf4.getText();
        this.tff4 = Integer.parseInt(tf4s);
        this.tf5s=tf5.getText();
        this.tff5 = Integer.parseInt(tf5s);
        this.tf6s=tf6.getText();
        this.tff6 = Integer.parseInt(tf6s);
        this.tf7s=tf7.getText();
        this.tff7 = Integer.parseInt(tf7s);
        this.tf8s=tf8.getText();
        this.tff8 = Integer.parseInt(tf8s);
        //inuse clock 
        this.uses= usef.getText();
        this.use=Integer.parseInt(uses);
        this.clocks = clockf.getText();
        this.clock = Integer.parseInt(clocks);
        //new calls
        this.froms= fromf.getText();
        this.from = Integer.parseInt(froms);
        this.tos=tof.getText();
        this.to = Integer.parseInt(tos);
        this.lens=lenf.getText();
        this.len = Integer.parseInt(lens);
        this.arrivals=arrivalf.getText();
        this.arrival = Integer.parseInt(arrivals);
         //unnecessary
        System.out.println("The REQUEST:");
        System.out.println(">>>>>=======Call History======<<<<<");
        System.out.println("FROM:"+from+"   TO:"+to+"    LENGTH:"+len);
        System.out.println("Arrival Time:"+arrival);
        //unnecessary end
        //new end calculating
        int var=arrival+len;
   
        if (end1f != null) {  
                    this.end1s = end1f.getText();  
                    if (end1s == null || end1s.isEmpty()) {  
                        this.end1 = 0;
                    }
                    else{
                        this.end1 = Integer.parseInt(end1s);
                    }
             } else {
                 this.end1 = 0;//if null 0
             }
             //new check for null or value in end1
             if (end2f != null) {  
                    this.end2s = end2f.getText();  
                    if (end2s == null || end2s.isEmpty()) {  
                        this.end2 = 0;
                    }
                    else{
                        this.end2 = Integer.parseInt(end2s);
                    }
             } else {
                 this.end2 = 0;//if null 0
             }
             if (end3f != null) {  
                    this.end3s = end3f.getText();  
                    if (end3s == null || end3s.isEmpty()) {  
                        this.end3 = 0;
                    }
                    else{
                        this.end3 = Integer.parseInt(end2s);
                    }
             } else {
                 this.end3 = 0;//if null 0
             }
         clockf.setText(String.valueOf(clock));
         usef.setText(String.valueOf(use));
    //1st step
  if(use==0)
  { 
         from1f.setText(froms);
         to1f.setText(tos);
         end1f.setText(String.valueOf(var));
         use=use+1;
         usef.setText(String.valueOf(use));
         up(this.from,this.to);

         clearnewfield();
         System.out.println(">>>>=====First CALL IN STACK=====<<<<");
      } 
      //use==1  
 else if(this.use==1)
 {
  int nearest = findNearest(total, arrival, end1);
  if(nearest!=arrival )
  { 
                f=findfrom();
                t=findto();
                down(f,t);
                 total=end1;
                 clockf.setText(String.valueOf(total));
                 processed+=1;
                 completed+=1;
                 processedf.setText(String.valueOf(processed));
                 completedf.setText(String.valueOf(completed));
                 use=use-1;
                 usef.setText(String.valueOf(use));
          System.out.println(">>>------Clearing Call------>>>>>");
                   
                
  }
  else
  {
      if( check()==true)
     {
        System.out.println("-----Call Busy------------->>>>>>>");  
     }
      else{
                   from2f.setText(froms);
                   to2f.setText(tos);
                   end2f.setText(String.valueOf(var));
                   up(from,to);
                   use=use+1;
                   usef.setText(String.valueOf(use));
                   total=arrival;
                 clockf.setText(String.valueOf(total));
                   clearnewfield();
         System.out.println(">>>>=====Second CALL IN STACK=====<<<<");                   
             }
  }
 }
 
 //use==2
 else if(this.use==2){
    small =  Math.min(end1,arrival);
    int smaller=Math.min(end2, small);
    if(small!=arrival )
  { 
      if(smaller!=end1)
      {
         from2s=from2f.getText();
         f=Integer.parseInt(from2s);
         to2s=to2f.getText();
         t=Integer.parseInt(to2s);
         down(f,t);
         total=end2;
         clockf.setText(String.valueOf(total));
         processed+=1;
         completed+=1;
         processedf.setText(String.valueOf(processed));
         completedf.setText(String.valueOf(completed));
         use=use-1;
         usef.setText(String.valueOf(use));
         from2f.setText("");
         to2f.setText("");
         end2f.setText("");
         System.out.println(">>>------Clearing Call------>>>>>");         
      }
      else
      {
          f=findfrom();
          t=findto();
          down(f,t);
          total=end1;
          clockf.setText(String.valueOf(total));
          processed+=1;
          completed+=1;
          processedf.setText(String.valueOf(processed));
          completedf.setText(String.valueOf(completed));
          use=use-1;
          usef.setText(String.valueOf(use));
          shift2to1();
         System.out.println(">>>------Clearing Call------>>>>>");
      }
  }
  else
  {
      if( check()==true)
           {
              System.out.println("-----Call Busy------------->>>>>>>");  
           }
            else{
                   from3f.setText(froms);
                   to3f.setText(tos);
                   end3f.setText(String.valueOf(var));
                   up(this.from,this.to);
                   use=use+1;
                   usef.setText(String.valueOf(use));
                   total=arrival;
                 clockf.setText(String.valueOf(total));
                
                   clearnewfield(); 
         System.out.println(">>>>=====Third CALL IN STACK=====<<<<");
            }
    }  
 } 
else if(this.use==3){
    small = Math.min(end3,Math.min(end2,Math.min(end1,arrival)));
    
    
    if(small!=arrival)
    {
        int smaller=Math.min(end3,Math.min(end2, end1) );
        if(smaller!=end1)
        {
            int smallest=Math.min(end3, end2);
            if(smallest!=end2)
            {
               from3s=from3f.getText();
                f=Integer.parseInt(from3s);
                to3s=to3f.getText();
                t=Integer.parseInt(to3s);
                down(f,t);
                 total=end3;
                 clockf.setText(String.valueOf(total));
                 processed+=1;
                 completed+=1;
                 processedf.setText(String.valueOf(processed));
                 completedf.setText(String.valueOf(completed));
                 use=use-1;
                 usef.setText(String.valueOf(use));
                 //clearing
                 from3f.setText("");
                 to3f.setText("");
                 end3f.setText("");
           System.out.println(">>>------Clearing Call------>>>>>");  
            }
            else
            {
               from2s=from2f.getText();
                f=Integer.parseInt(from2s);
                to2s=to2f.getText();
                t=Integer.parseInt(to2s);
                down(f,t);
                 total=end2;
                 clockf.setText(String.valueOf(total));
                 processed+=1;
                 completed+=1;
                 processedf.setText(String.valueOf(processed));
                 completedf.setText(String.valueOf(completed));
                 use=use-1;
                 usef.setText(String.valueOf(use));
                 this.from3s =from3f.getText();
                    from2f.setText(from3s);
                   this.to3s =to3f.getText();
                   to2f.setText(to3s);
                   this.end3s =end3f.getText();
                   end2f.setText(end3s);
                   //clearing 3rd field
                   from3f.setText("");
                 to3f.setText("");
                 end3f.setText("");
           System.out.println(">>>------Clearing Call------>>>>>");  
            }
        }
        else
        {
//            if(small)
                f=findfrom();
                t=findto();
                down(f,t);
                 total=end1;
                 clockf.setText(String.valueOf(total));
                 processed+=1;
                 completed+=1;
                 processedf.setText(String.valueOf(processed));
                 completedf.setText(String.valueOf(completed));
                 use=use-1;
                 shift2to1();
                 this.from3s =from3f.getText();
                  from2f.setText(from3s);
                   this.to3s =to3f.getText();
                   to2f.setText(to3s);
                   this.end3s =end3f.getText();
                   end2f.setText(end3s);
                //clearing
                 from3f.setText("");
                 to3f.setText("");
                 end3f.setText("");
          System.out.println(">>>------Clearing Call------>>>>>");      
            }  
    }
    else
    {
                 total=arrival;
                 clockf.setText(String.valueOf(total));
                 blocked+=1;
                 processed+=1;
                 blockedf.setText(String.valueOf(blocked));
                 processedf.setText(String.valueOf(processed));
                 clearnewfield();
            System.out.println(">>>------Blocking Call------<<<");               
    }
}                 
    }//GEN-LAST:event_enterActionPerformed

    private void maxnofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxnofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxnofActionPerformed

    private void clockfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockfActionPerformed
       
       
    }//GEN-LAST:event_clockfActionPerformed

    private void usefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usefActionPerformed
      
    }//GEN-LAST:event_usefActionPerformed

    private void tofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tofActionPerformed
              

    }//GEN-LAST:event_tofActionPerformed

    private void lenfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenfActionPerformed
              

    }//GEN-LAST:event_lenfActionPerformed

    private void arrivalfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalfActionPerformed
               

    }//GEN-LAST:event_arrivalfActionPerformed

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    private void enter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter1ActionPerformed
         
        setVisible(false);
        Indexframe secondFrame = new Indexframe();
        secondFrame.setVisible(true);
    }//GEN-LAST:event_enter1ActionPerformed
 
    public static void main(String args[]) {
        System.out.println("Welcome to Busy Call Telephone Simulation");
        System.out.println("              Compiled by:Nishant shah(021-351)");
        System.out.println();
        System.out.println();
        System.out.println();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new busyphonesimulate().setVisible(true);}
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrivalf;
    private javax.swing.JTextField blockedf;
    private javax.swing.JTextField busyf;
    private javax.swing.JTextField clockf;
    private javax.swing.JTextField completedf;
    private javax.swing.JTextField end1f;
    private javax.swing.JTextField end2f;
    private javax.swing.JTextField end3f;
    private javax.swing.JButton enter;
    private javax.swing.JButton enter1;
    private javax.swing.JTextField from1f;
    private javax.swing.JTextField from2f;
    private javax.swing.JTextField from3f;
    private javax.swing.JTextField fromf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lenf;
    private javax.swing.JTextField maxnof;
    private javax.swing.JTextField processedf;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField to1f;
    private javax.swing.JTextField to2f;
    private javax.swing.JTextField to3f;
    private javax.swing.JTextField tof;
    private javax.swing.JTextField usef;
    // End of variables declaration//GEN-END:variables


} 

