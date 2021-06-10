package com.project.Cotacoes.mapper;
import com.project.Cotacoes.model.Dto.StockDTO;
import com.project.Cotacoes.model.Stock;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {
    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();
        dto.setId(stock.getId());
        dto.setName(stock.getName());
        dto.setPrice(stock.getPrice());
        dto.setVariation(stock.getVariation());
        dto.setDate(stock.getDate());
        return dto;
    }

    public List<StockDTO> toDto (List<Stock> liststock){
       return liststock.stream().map(this::toDto).collect(Collectors.toList());
    }
















}
