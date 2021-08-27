# Aerolineas-del-Norte


**DOWNLOAD APPLICATION .JAR :** https://www.mediafire.com/file/3c9ae9w6ob1ebz4/AEROLINEAS_DEL_NORTE.jar/file 


1. [Introduction](#Introduction)
2. [Home screen](#Home-screen)
3. [Get Tickets](#Get-Tickets)
4. [Flight details](#Flight-details)
5. [Payment](#Payment)
6. [Contact information](#Contact-information)
7. [Itinerary](#Itinerary)

 ## 1. Introduction

Aerolineas del Norte Cyp is a system designed to get flight tickets to somewhere in the north of the country Argentina, for this we have the Java programming language and several extensions related to it. The idea arose at the beginning of years when there was still no experience of using this language and a working prototype was made, very easy to achieve. With the passage of time this project was resumed but with the aim of perfecting it with what was learned during the year and presenting it for the final work of the Programming subject. Some of the improvements that were made were: better graphical interface, optimization when processing flight information, etc.
This software has 6 JFrames that we will describe throughout this writing.

 What all of these have in common is:
 
* Resolution (674 X 465).
* Buttons Minimize, Restore (disabled), Move, Close.
* Window located in the central part of the screen.

## 2. Home Screen

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/234773660_5027744483958826_7741103690397886421_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=b9115d&_nc_ohc=5veQ1_n9MkQAX_zFmnr&tn=ICuuEgcaK7k8X9f1&_nc_ht=scontent.ftuc1-1.fna&oh=46dd5e38160de231f931cc561ca9dd4b&oe=614C74CD)

The home screen serves to welcome the user.
The screen is composed of a Background Image that contains the title and a button that sends us to the Ticket Reservation screen, closing the main screen.

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {      
				aerolineas1 abrir = new aerolineas1();	
				abrir.setVisible(true);	      
				Inicio1.this.dispose();        

## 3. Get Tickets

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/240590687_5027744433958831_2572694117845748116_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=b9115d&_nc_ohc=iYWXJAtkn_sAX8lYqNg&tn=ICuuEgcaK7k8X9f1&_nc_ht=scontent.ftuc1-1.fna&oh=57b207031151995b9acb79c5cb5fa2f1&oe=614E0C66)

1- Made up of 2 JButtons, its function affects points 2 and 3. What this achieves is that depending on the decision, if we select ONLY IDA, it cancels the JCalendar Return and that it does not appear in the table. But if we select ROUND TRIP, these do not suffer changes.

```
  if (Ida.isSelected()) {
                  regreso.setEnabled(false);
                } else {
                    regreso.setEnabled(true);
                }
          }

  if(Ida.isSelected()) {
            tabla.getColumnModel().getColumn(3).setMaxWidth(0);
            tabla.getColumnModel().getColumn(3).setMinWidth(0);
            tabla.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
            tabla.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
```

2- This button collects the data entered in the 2 JComboBox and the 2 JDataChooser, but to achieve this you must pass the search filter which consists of several Items:
* There can be no empty lockers.
* The flights should not coincide, for example "JUJUY-JUJUY".

If these parameters can be passed, the next step is to go to the table in point 4, deactivating itself, activating and showing button 3.

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/240442316_5027744427292165_227936514430663446_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=b9115d&_nc_ohc=DBH9kw9l9U4AX8R6jZE&_nc_ht=scontent.ftuc1-1.fna&oh=ec931f80f47bba705c9965586c8f32ae&oe=614E422F)

Now if these items are not met, an alert (JOptionPane) will appear informing the user that there is incorrect data entered or, failing that, that data is missing.

![Texto alternativo](https://scontent.ftuc1-2.fna.fbcdn.net/v/t1.6435-9/240606885_5027744633958811_8802359577476373573_n.jpg?_nc_cat=102&ccb=1-5&_nc_sid=b9115d&_nc_ohc=l1q6iUj2OREAX9p2exq&tn=ICuuEgcaK7k8X9f1&_nc_ht=scontent.ftuc1-2.fna&oh=251b60ca94018f2a2b3ac6eea2810517&oe=614C9E45)

```
    if(operacion == operacion1){
    {	
    JOptionPane.showMessageDialog(BuscarVuelo1, "Revise los campos ingresados", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
    }
    }else{
    {	
    JOptionPane.showMessageDialog(BuscarVuelo1, "Buscando su Destino...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);				
    }


    try {
    String []BuscarVuelo = new String [4];
    BuscarVuelo[0]=(String)origen.getSelectedItem();
    BuscarVuelo[1]=(String)destino.getSelectedItem();

    SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
    BuscarVuelo[2]=(String)dFormat.format(partida.getDate());



    if (Ida.isSelected()) {
    regreso.setEnabled(false);
    } else {
     regreso.setEnabled(true);

    SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
    BuscarVuelo[3]=(String)dformat.format(regreso.getDate());



     if(botonbuscar.isSelected()) {
    boton2.setVisible(true);
     botonbuscar.setEnabled(false);
    }else {	

    }

    }
    model.addRow(BuscarVuelo);

    }catch (Exception e1) {

    JOptionPane.showMessageDialog(BuscarVuelo1, "Error de datos. Vuelva a intentar", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);			

```

3- This button is hidden and the person responsible for making it appear is button 2, its function is to update the passage if the user wants, for example, to change the date. 
It presents the same security case as the one above, it must comply with these parameters to be able to display the information in the table, if this is successful, it shows button 5.


```
        operacion=origen.getSelectedItem().toString();
				operacion1=destino.getSelectedItem().toString();
				
				if(boton2.isEnabled()) {
					elegir.setVisible(true);
				}
				
				if(operacion1 == operacion){
					
					JOptionPane.showMessageDialog(BuscarVuelo1, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
				}else{
					
				String [] BuscarVuelo = new String [4];
				BuscarVuelo[0]=(String)origen.getSelectedItem();
				BuscarVuelo[1]=(String)destino.getSelectedItem();
				SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
				BuscarVuelo[2]=(String)dFormat.format(partida.getDate());
				
				if (Ida.isSelected()) {
			          regreso.setEnabled(false);
			        } else {
			            regreso.setEnabled(true);
			      
				SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");	
				BuscarVuelo[3]=(String)dformat.format(regreso.getDate());
			
			        }
				for ( int i = 0; i < tabla.getColumnCount(); i ++) {
				tabla.setModel(model);
				tabla.setValueAt(BuscarVuelo[i], filas, i);
			}}}
```

4- It receives the data from button 2 and if necessary from button 3 and has the same search parameter as the previous ones. It has 4 Columns: Origin - Destination - Departure - Return (optional).

```
    tabla = new JTable();
		tabla.setEnabled(false);
		tabla.setBackground(new Color(135, 206, 235));
		scrollPane.setViewportView(tabla);
		
		tabla.setModel(model);
```
5- This button collects the data from the table and sends it to the next Frame. It also closes and terminates the Take Out Passages Frame Closing it.


```
        operacion1 = destino.getSelectedItem().toString();
				operacion2 = origen.getSelectedItem().toString();
					
				if(operacion1 == operacion2){
					
					JOptionPane.showMessageDialog(BuscarVuelo1, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
				}else {
					
				{					
					JOptionPane.showMessageDialog(BuscarVuelo1, "Ultimando Detalles...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
					}
				{
					Compra1 abrir = new Compra1();
					abrir.setVisible(true);
					Compra1.origenn.setText((String) origen.getSelectedItem());
					Compra1.destinoo.setText((String) destino.getSelectedItem());
                   
				}
				
				aerolineas1.this.dispose();
			}}

```

## 4. Flight details

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/240582285_5027744393958835_4283612462927093839_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=b9115d&_nc_ohc=o2SXROLY9bsAX_e_eCV&_nc_ht=scontent.ftuc1-1.fna&oh=f73e7127e1576b5b351b2326afa4f12b&oe=614C587F)

In this Frame we have the information sent from the previous one, which would be the ORIGIN and DESTINATION in this case Salta-Jujuy.
 Likewise, if the trip is IDA, the button will be selected.
 
 ```
    if (ida.isSelected()) {
					
					double n1 = Double.parseDouble(Tootal.getText());
				    Tootal.setText(String.valueOf(n1/2));
				    
				    ida.setEnabled(false);
				    iday.setEnabled(true);
				    
				}
```

If you have chosen ROUND TRIP, it would act the same as the IDA only if you select that button. The calculation that is made is to multiply the total of the trip when it is ROUND TRIP.

```
    if (iday.isSelected()) {
					
					ida.setEnabled(true);
	
			
					double n1 = Double.parseDouble(Tootal.getText());
				    Tootal.setText(String.valueOf(n1*2));
				    
				iday.setEnabled(false);
				}

```

We can also enter the number of passengers who will travel, it will be multiplied by the type of trip that we will do (Basic-Intermediate-Premium) showing us the total in the lower part on the right.

```
    if (Basico.isSelected()) {
					
					basico.setVisible(true);
					intermedio.setVisible(false);
					premiun.setVisible(false);
					Total.setVisible(true);
					Total.setText("4545.00");
					Impuestos.setText("3713.94");
					
			        } else {
			        }
				
				{
					double n1 = Double.parseDouble(Total.getText());
					double n2 = Double.parseDouble(Cantidad.getText());
					double n3 = Double.parseDouble(Impuestos.getText());
					double n4 = Double.parseDouble(Emision.getText());
				    Tootal.setText(String.valueOf(n1*n2+n3+n4));
				}
			}
```

Finally we have the Continue button which will send us to another screen passing the Total data, like the previous ones, this will also close.

```
    Pago1 abrir1 = new Pago1();
				abrir1.setVisible(true);
				Compra1.this.dispose();
				Pago1.recibe.setText((String)Tootal.getText());
					
			}	
```

## 5. Payment

This Frame is designed to make card or cash payments. We achieve this thanks to 2 JRadioButton, we also have the reservation number (JLabel) and the total (JTextField), at the bottom with the Continue button that fulfills the same function despite the user's choice.

If we select Card payment, it will show us only the card payment characteristics and we must fill in the corresponding data with any card and accept the terms and conditions to activate the Continue button

![Texto alternativo](https://scontent.ftuc1-2.fna.fbcdn.net/v/t1.6435-9/240579174_5027744497292158_5655584701963270833_n.jpg?_nc_cat=102&ccb=1-5&_nc_sid=b9115d&_nc_ohc=wMEORrJlOSoAX9hJ-la&_nc_ht=scontent.ftuc1-2.fna&oh=fa3954dc6c3d72b4b7e41eff9a93170d&oe=614FB42B)

```
    if(TarjetasCredito.isSelected()) {		
					panelTarjeta.setVisible(true);
					panelContado.setVisible(false);
                                                     Continuar.setVisible(true);
					boton.setVisible(false);
					}else {
						
					}
			}
```
In the case of selecting CASH, it will give us to choose the means of payment with several JRadioButtons, a JTextField, a JComboBox and a JToogleBoton, it is also mandatory to fill in the fields requested for the transaction to be successful and accept terms and conditions to activate the Continue button

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/240641323_5027744477292160_6173087406901468062_n.jpg?_nc_cat=101&ccb=1-5&_nc_sid=b9115d&_nc_ohc=R9jnJ2Yx52EAX9p35Cs&_nc_ht=scontent.ftuc1-1.fna&oh=ce20de3fc2f5f5c5c67c5f2327a5ef99&oe=614D59F9)

```
if(Efectivo.isSelected()) {		
					panelTarjeta.setVisible(false);
					panelContado.setVisible(true);
                                                     boton.setVisible(true);
					Continuar.setVisible(false);
					}else {
						
					}
			}
```

The Continue button, to function you must accept the terms and fill in the data, having completed the data correctly it will send us to another frame also closing and showing the new one, if it has not completed the correct data it will not let us continue with the purchase

![Texto alternativo](https://scontent.ftuc1-2.fna.fbcdn.net/v/t1.6435-9/240273034_5027744610625480_2914925108028869397_n.jpg?_nc_cat=109&ccb=1-5&_nc_sid=b9115d&_nc_ohc=FECXkdqJFTQAX9I4TBB&tn=ICuuEgcaK7k8X9f1&_nc_ht=scontent.ftuc1-2.fna&oh=b075d4beb3ffeb08d93cbac74209472a&oe=614E8FC8)

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/240594539_5027744660625475_2110767438534587475_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=b9115d&_nc_ohc=fB-jRpig66YAX-IcR_N&_nc_ht=scontent.ftuc1-1.fna&oh=da0c454ec6e169e668897f438d4af8a5&oe=614D9C7E)

```
if(aceptar.isSelected()) {
					Continuar.setEnabled(true);
				}else {
					Continuar.setEnabled(false);
				}

if(operacion8=="" && operacion9=="" ){
				
			    	JOptionPane.showMessageDialog(btnContinuar, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);	    	
				}else{
					{
						JOptionPane.showMessageDialog(btnContinuar, "Ultimando Detalles...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
						Datos1 abrir = new Datos1();	
						abrir.setVisible(true);  
						Pago1.this.dispose();
```

## 6. Contact information

In this frame it is requested to fill in the field of the main user for future contacts or flight controls. The fields must all be completed to pass the security processes of said software.

![Texto alternativo](https://scontent.ftuc1-2.fna.fbcdn.net/v/t1.6435-9/240613731_5027744677292140_5586010500085639526_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=b9115d&_nc_ohc=swYBlWwgaicAX8TbuIM&_nc_ht=scontent.ftuc1-2.fna&oh=56e19f326e227194e03f25588f419cc9&oe=614E1205)

THE CONTINUE BUTTON verifies if the data was entered correctly and in order by sending us to the other JFrame, if there is an error, a Warning will be triggered that some field was not filled or that it has a typing error.


```
operador1 = nacionalidad.getSelectedItem().toString();
				operador2 = genero.getSelectedItem().toString();
				if(operador1=="" || operador2=="" ){
					
					JOptionPane.showMessageDialog(btnContinuar, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
				}else{
				{
					JOptionPane.showMessageDialog(btnContinuar, "  ¡ Muchas Gracias por su Compra !", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
				}
				{
					
					Itinerario1 abrir = new Itinerario1();	
					abrir.setVisible(true);
					
					Itinerario1.apellido.setText((String)apellidoo.getText());
					Itinerario1.nombre.setText((String)nombree.getText());
					Itinerario1.documento.setText((String)doc.getText());
					Itinerario1.email.setText((String)emaill.getText());
					
					
				}
					
				Datos1.this.dispose();
```

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/240338756_5027744763958798_5235577849234860949_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=b9115d&_nc_ohc=ztJObIePCLEAX-Tdkuf&_nc_ht=scontent.ftuc1-1.fna&oh=ae76facdf3165408a542b5eae46b385b&oe=614F5AD0)

However, if the data was entered correctly, it will show us the alert and that our purchase was made with total success.

![Texto alternativo](https://scontent.ftuc1-1.fna.fbcdn.net/v/t1.6435-9/240637637_5027744810625460_1740930542085103974_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=b9115d&_nc_ohc=ADcHotO34K8AX-4_B8n&_nc_ht=scontent.ftuc1-1.fna&oh=5f8816c0ec6df144b7e66e6012579d92&oe=614ECA9D)

## 7. Itinerary

This and last Jframe has the title Itinerio (JLabel) reservation number (Jlabel), an animated gif and a JPanel where it stores all the data previously entered, especially the contact information. Depending on the purchase, it will let us edit the flight departure time.

Then in the lower right we have 3 buttons: Start, Print and see the air situation of your flight.

![Texto alternativo](https://scontent.ftuc1-2.fna.fbcdn.net/v/t1.6435-9/240626528_5027744830625458_8288887138100171840_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=b9115d&_nc_ohc=A3lSsgnUshoAX8nltLx&_nc_ht=scontent.ftuc1-2.fna&oh=0c55dd2ca863963641e3f6e3178d50e1&oe=614D981B)

### Start button

```
Inicio1 abrir = new Inicio1();	
				abrir.setVisible(true);
				Itinerario1.this.dispose();
```

### Print button

```
PrinterJob job = PrinterJob.getPrinterJob();
				job.setJobName("Print Data");
					
				job.setPrintable(new Printable(){
					public int print(Graphics pg,PageFormat pf, int pageNum) {	
						if(pageNum > 0) {
							return Printable.NO_SUCH_PAGE;
						}
						Graphics2D g2 = (Graphics2D)pg;
						g2.translate(pf.getImageableX(), pf.getImageableY());
						g2.scale(1.30, 1.30);
						panel1.paint(g2);
						return Printable.PAGE_EXISTS;
					}	
				});
				boolean ok = job.printDialog();
				if(ok) {
					try {
						job.print();
					}
					catch (PrinterException ex) {}
				}
```

### Internet button

  ```
  try {
  Desktop.getDesktop().browse(new URI("https://www.aa2000.com.ar/"));
  } catch (URISyntaxException ex) {
  System.out.println(ex);
  }catch(IOException e1){
  System.out.println(e1);
  }
  ```
