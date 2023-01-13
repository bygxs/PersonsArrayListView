# PersonsArrayListView


11:57 Friday 13 Jan 2023
SUCCESS! 

intent.putExtra sending data from 
Main Activity to Person Activity. 
using onItemClickListner

learned also on how to change an int to String 
and String to an int

Example:
 int  age = getIntent().getIntExtra("AGE",0);
       // String age2 = String.valueOf(age); // changing int to String
        tvAge.setText(String.valueOf(age));

        String address = getIntent().getStringExtra("ADDRESS");
        tvAddress.setText(address);

       // tvAddress.setText(Integer.parseInt( address)); changeing String to int

