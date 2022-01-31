package com.tnColombia.controller;

import com.tnColombia.domain.Tncolombia;
import com.tnColombia.service.ListadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoController {

    private final ListadoService listadoService;

    public ListadoController(ListadoService listadoService) {
        this.listadoService = listadoService;

    }

    @RequestMapping("/")
    public String listarPrincipal() {

        return "listado";
    }

    @RequestMapping("/procesar")
    public String guardarFormulario(@RequestParam("n") String nombre,@RequestParam("d") String dependencia,
            @RequestParam("f") String fecha, @RequestParam("a") Byte [] archivo, Model model) {
       
        Tncolombia formulario = new Tncolombia();

        

            formulario.setNombre(nombre);
            formulario.setDependencia(dependencia);
            formulario.setFecha(fecha);
            //formulario.setArchivo(archivo);
            
                
                             
             listadoService.guardar(formulario);
             String respuesta = "Archivo Creado";

             model.addAttribute("respuesta", respuesta);
             
           
        

        return "listado";
    }
    
    

}
