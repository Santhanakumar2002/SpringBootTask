package com.excel.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.entity.ExcelDetail;

public interface ExcelRepo  extends JpaRepository<ExcelDetail ,UUID>{

}