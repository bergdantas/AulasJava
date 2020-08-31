/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula herança
 */
public class Main {
	public static void main(String[] args) {

//CRIANDO INSTANCIAS
	Account conta1 = new Account(5488, "Tião Josefino", 547857.58);
	BusinessAccount contaComercial1 = new BusinessAccount(2547, "Hereditário Corporations", 5896.58, 25000.00);
	SavingsAccount contaPoupanca1 = new SavingsAccount(2445, "Joana Santos", 100.50, 0.99);
	
	
//UPCASTING - objeto da subclasse dentro de uma variável da superclasse (objeto ba, dentro de uma variável account)
	Account up1 = new BusinessAccount(58457, "Zézinho do Bar", 4578.61, 5885.58);
	Account up2 = new SavingsAccount(1548, "Chico Bicheiro", 45486.00, 0.99);
	Account up3 = contaComercial1;
	
	
//DOWNCASTING - objeto da superclasse dentro de uma variável da subclasse (objeto acount dentro da variável ba)
	//BusinessAccount down1 = up1; //erro por incompatibilidade. Não é segura? Conversão não natural
	BusinessAccount down1 = (BusinessAccount)up1;
	down1.loan(100);
	
	//BusinessAccount down2 = (BusinessAccount) up2; // só dá problema em tempo de execução
	BusinessAccount down2 = null;
	if(up2 instanceof BusinessAccount){
		down2 = (BusinessAccount) up2;
	}
	else{
		System.out.println("Erro");
	}
	
	BusinessAccount down3 = null;
	if(up3 instanceof BusinessAccount){
		down3 = (BusinessAccount) up3;
		down3.deposit(100);
	}
	else{
		System.out.println("Erro");
	}
	
	System.out.println(conta1);
	System.out.println(contaComercial1);
	System.out.println(contaPoupanca1);
	System.out.println(up1);
	System.out.println(up2);
	System.out.println(up3);
	System.out.println(down1);
	System.out.println(down2);
	System.out.println(down3);
		
//OPERAÇÕES COM OS MÉTODOS SOBRESCRITOS
	System.out.println(contaPoupanca1.getBalance());
	contaPoupanca1.withDraw(50);
	System.out.println(contaPoupanca1.getBalance());
	contaPoupanca1.deposit(50);		
	System.out.println(contaPoupanca1.getBalance());
		
	}
}