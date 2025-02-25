package com.example.buensaborback.domain.dto.CategoriaDtos;

import com.example.buensaborback.domain.dto.ArticuloDto;
import com.example.buensaborback.domain.dto.BaseDto;
import com.example.buensaborback.domain.dto.SucursalDtos.SucursalShortDto;
import com.example.buensaborback.domain.entities.Articulo;
import com.example.buensaborback.domain.entities.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoriaGetDto extends BaseDto {
    private String denominacion;
    private boolean esInsumo;
    private Set<SucursalShortDto> sucursales;
    private List<CategoriaGetDto> subCategorias;
    private CategoriaDto categoriaPadre;
}