package org.zerock.ajaxserver.service;

import org.zerock.ajaxserver.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;

public enum StoreService {
    INSTANCE;

    private List<StoreDTO> storeDTOList;

    StoreService(){

        storeDTOList = new ArrayList<>();
        storeDTOList.add(new StoreDTO(1L,"무교동 북어국",37.5677429, 126.9776194,"북어국","한식" ));
        storeDTOList.add(new StoreDTO(2L,"오카구라", 37.5698057, 126.9900538, "라멘", "일식"));

    }
    public List<StoreDTO> getAll(){
        return this.storeDTOList;
    }
}
