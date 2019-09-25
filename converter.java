//get the users input 
       inputNum = inputtype.getSelectedItem().toString();
       OutputNum = outputtype.getSelectedItem().toString();

// if decimal input
		if(inputNum.equals("Decimal")){
			
			{

//convert to hex
	if(OutputNum.equals("Hex")){								

	String str_Hex = Long.toHexString(Long.parseLong(input));		
	Outlbl.setText(hexstr);
									
				}
//convert to binary
	if(OutputNum.equals("Binary")){

	String str_Bin= Long.toBinaryString(Long.parseLong(input));
	Outlbl.setText(binstr);
				}
								   			
//convert to octal
	if(OutputNum.equals("Octal")){
	
	String Str_Oct = Long.toOctalString(Long.parseLong(input));
	Outlbl.setText(octstr);
				}
// if hex input
if(inputNum.equals("Hex")){

//convert to decimal
	if(OutputNum.equals("Decimal")){
				    
	//hex to dec
				 
				
	String decstr = Long.toString(Long.parseLong(input,16));
					
	outputbox.setText(decstr);
					
	}
//convert to binary
	if(OutputNum.equals("Binary")){
	//hex to binary
		
	String binstr = Long.toBinaryString(Long.parseLong(input,16));
					
	outputbox.setText(binstr);
					
				}
						   					
				
//convert to octal
	if(OutputNum.equals("Octal")){
					
	String octstr = Long.toOctalString(Long.parseLong(input,16));
					
	outputbox.setText(octstr);
					}

// if binary input
		if(inputNum.equals("Binary")){


//convert to hex
				if(OutputNum.equals("Hex")){
					
					String hexstr = Long.toHexString(Long.parseLong(input,2));
					
					outputbox.setText(hexstr);
				}
				//convert to decimal
				if(OutputNum.equals("Decimal")){
					
					String decstr = Long.toString(Long.parseLong(input,2));
					
					outputbox.setText(decstr);
					
				}
				}
				//convert to octal
				if(OutputNum.equals("Octal")){
					
					String octstr = Long.toOctalString(Long.parseLong(input,2));
					
					outputbox.setText(octstr);
				}
			}

// if octal input
		if(inputNum.equals("Octal")){
			
			{
			
				//convert to hex
				if(OutputNum.equals("Hex")){
					
					String hexstr = Long.toHexString(Long.parseLong(input,8));
					
					outputbox.setText(hexstr);
					
				}
				//convert to decimal
				if(OutputNum.equals("Decimal")){
					
					String decstr = Long.toString(Long.parseLong(input,8));
					
					outputbox.setText(decstr);
				}
				
					   
				}
				//convert to binary
				if(OutputNum.equals("Binary")){
					
					String binstr = Long.toBinaryString(Long.parseLong(input,8));
					
					outputbox.setText(binstr);
					
				}
			}
