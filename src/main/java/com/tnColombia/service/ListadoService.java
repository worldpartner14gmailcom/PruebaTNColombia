
package com.tnColombia.service;

import com.tnColombia.domain.Tncolombia;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tnColombia.repository.ArchivoRepository;

@Service
public class ListadoService {
    
    
    private final ArchivoRepository archivoRepository;
    
    public ListadoService(ArchivoRepository archivoRepository1){
    this.archivoRepository = archivoRepository1;
    }
    
    
  public Tncolombia guardar(Tncolombia tnColombia){
     return archivoRepository.save(tnColombia);
  }  
    
  
  
           
   
   
     
     
    
}
