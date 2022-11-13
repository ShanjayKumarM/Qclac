package com.crio.qcalc;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QclacApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QclacApplication.class, args);
		
		// StandardCalculator calc = new StandardCalculator();

		
		
        LogicCalculator calc = new LogicCalculator();

        calc.AND(8, 6);

        calc.printResult();
// 		StandardCalculator calc = new StandardCalculator();

// calc.add(Double.MAX_VALUE, 1.0);

// calc.printResult();

		
	}

}
