package br.com.fpimentel.administrador;

import javax.swing.JMenu;

import br.com.fpimentel.Janela;
import br.com.fpimentel.Menu;
import br.com.fpimentel.util.Arquivos;

public class MenuAdministrador {
	
	public MenuAdministrador(Object a){	
		// ----- Op��es da Barra de Menu
		JMenu administracaoMenu = new JMenu("Administra��o");
		administracaoMenu.setIcon(Arquivos.buscarIcone("img/user_business.jpg"));
		Janela.barraMenu.add(administracaoMenu);
		
			/*
			 * 	Adicionar Usu�rio
			 */
			administracaoMenu.add(Menu.subMenu("Adicionar Usu�rio","img/user.png",a,1));
			
			/*
			 * 	Editar Usu�rio
			 */
			administracaoMenu.add(Menu.subMenu("Editar Usu�rio","img/page_white_wrench.png",a,2));

			/*
			 * 	Listagem de Usu�rios
			 */
			administracaoMenu.add(Menu.subMenu("Listagem de Usu�rios","img/book_addresses.png",a,3));

			/*
			 * 	Listagem de Empresas
			 */
			administracaoMenu.add(Menu.subMenu("Listagem de Empresas","img/book.png",a,4));
	}

}
