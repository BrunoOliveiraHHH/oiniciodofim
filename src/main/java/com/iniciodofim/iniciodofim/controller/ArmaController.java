package com.iniciodofim.iniciodofim.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iniciodofim.iniciodofim.model.ArmaModel;
import com.iniciodofim.iniciodofim.repository.ArmaRepository;

@Controller
public class ArmaController {

	@Autowired
	private ArmaRepository arm;

	@RequestMapping(value = "/arma.html", method = RequestMethod.GET)
	public String formArmaGet() {		
		return "/arma.html";
	}

	@RequestMapping(value = "/arma.html", method = RequestMethod.POST)
	public String formArmaPost(HttpServletRequest request) throws IOException {

		ArmaModel novaArma = new ArmaModel();
		novaArma.setNome(request.getParameter("nome"));
		novaArma.setCusto(request.getParameter("custo"));
		novaArma.setDano(request.getParameter("dano"));
		novaArma.setTipoDeDano(request.getParameter("tipoDeDano"));
		novaArma.setPeso(request.getParameter("peso"));
		novaArma.setPropriedade(request.getParameter("propriedade"));
		novaArma.setObservacao(request.getParameter("observacao"));
		arm.save(novaArma);

		return "redirect:/arma.html";
	}

}