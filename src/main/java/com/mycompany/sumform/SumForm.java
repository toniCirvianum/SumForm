/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumform;
//librerias necesarias
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class SumForm implements ActionListener{//implementando el listener de eventos
    
    JButton bt1;//creando variables globales de los botones
    JLabel jl1, jl2, jl3;//creando variables globales para las etiquetas
    JTextField jt1, jt2, jt3;//creando variables globales para los campos de texto
    JFrame jf = new JFrame("Formulario Basico Java");//creacion de ventana con el titulo
    
    public SumForm(){//constructor de la clase        
        
        jf.setLayout(new FlowLayout());//Configurar como se dispondra el espacio del jframe
        Dimension d = new Dimension();//objeto para obtener el ancho de la pantalla
        
        //Instanciando etiquetas
        jl1 = new JLabel("Numero 1");
        jl2 = new JLabel("Numero 2");
        jl3 = new JLabel("=");
        
        //Instanciando cuadros de texto
        jt1 = new JTextField(2);
        jt2 = new JTextField(2);
        jt3 = new JTextField(2);
        
        //Instanciando boton con texto
        bt1 = new JButton("+");
        
        //añadiendo objetos a la ventana
        jf.add(jl1); jf.add(jt1); jf.add(bt1); jf.add(jl2); jf.add(jt2);
        jf.add(jl3); jf.add(jt3);
        
        //margenes para texto en boton
        bt1.setMargin(new Insets(1, 5, 1, 5));
                
        //añadiendo el listener a los botones para manipular los eventos del click
        bt1.addActionListener(this);        
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X        
        jf.setResizable(false);//para configurar si se redimensiona la ventana
        jf.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra la ventana (x, y)
        jf.setSize(400, 250);//configurando tamaño de la ventana (ancho, alto)
        jf.setVisible(true);//configurando visualización de la venta
    }
 
    public static void main(String[] args) {        
        SumForm gj = new SumForm();//uso de constructor para la ventana
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
        
        int n1, n2, nr;//variables que almacenaran los numeros de los campos de texto
                
        if(e.getSource()==bt1){//podemos comparar por el contenido del boton
            
            //Los campos de texto son de tipo string, asi que tomamos la cadena con el metodo .getText()
            //y lo almacenamos en la variable.
            n1 = Integer.parseInt(jt1.getText());
            n2 = Integer.parseInt(jt2.getText());
            
            nr = n1 + n2; //realizamos la operacion
            
            jt3.setText(""+nr);/*mostramos el valor mediante el metodo .setText() como muestra cadenas
             anteponemos una cadena vacia y concatenamos el resultado*/
        }        
    }
}