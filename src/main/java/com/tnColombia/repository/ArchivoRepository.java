
package com.tnColombia.repository;

import com.tnColombia.domain.Tncolombia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArchivoRepository extends JpaRepository<Tncolombia, Integer>{
    
    
   
}
