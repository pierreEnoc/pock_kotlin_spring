package com.enocp.pontointeligente.repository

import com.enocp.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository: MongoRepository<Empresa, String> {
  
  fun findByCnpj(cnpj: String): Empresa?
}
