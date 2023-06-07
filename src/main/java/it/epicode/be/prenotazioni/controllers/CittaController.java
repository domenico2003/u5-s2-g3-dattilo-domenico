package it.epicode.be.prenotazioni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.be.prenotazioni.model.Citta;
import it.epicode.be.prenotazioni.service.GeneralService;

@RestController
@RequestMapping("/citta")
public class CittaController {
	@Autowired
	GeneralService ps;

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Citta cercaCittaByid(@PathVariable(required = false) String id) throws Exception {
		return ps.findCittaById(id);
	}
}
