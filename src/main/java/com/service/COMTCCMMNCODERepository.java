package com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface COMTCCMMNCODERepository extends JpaRepository<COMTCCMMNCODE, String>
{

}