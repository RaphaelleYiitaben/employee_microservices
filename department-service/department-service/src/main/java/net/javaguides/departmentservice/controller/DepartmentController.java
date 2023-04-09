package net.javaguides.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;


    @PostMapping
    public ResponseEntity<DepartmentDto> savedepartment(@RequestBody DepartmentDto departmentDto){

        DepartmentDto savedDepartmentDto = departmentService.saveDepartment(departmentDto);

        return new ResponseEntity<>(savedDepartmentDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable("id") Long departmentId){

        DepartmentDto getDepartmentDto = departmentService.getDepartmentById(departmentId);

        return new ResponseEntity<>(getDepartmentDto, HttpStatus.OK);
    }

    @GetMapping("code/{code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("code") String departmentCode){

        DepartmentDto getDepartmentDto = departmentService.getDepartmentByCode(departmentCode);

        return new ResponseEntity<>(getDepartmentDto, HttpStatus.OK);
    }
}
