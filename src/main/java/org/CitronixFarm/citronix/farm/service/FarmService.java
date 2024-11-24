package org.CitronixFarm.citronix.farm.service;

import org.CitronixFarm.citronix.farm.dto.request.CreateFarmDTO;
import org.CitronixFarm.citronix.farm.dto.request.FarmFilterDTO;
import org.CitronixFarm.citronix.farm.dto.request.UpdateFarmDTO;
import org.CitronixFarm.citronix.farm.dto.response.ResponseFarmDTO;
import org.CitronixFarm.citronix.common.service.BaseService;
import org.CitronixFarm.citronix.farm.entity.Farm;
import org.CitronixFarm.citronix.shared.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public interface FarmService extends BaseService<Long, CreateFarmDTO, UpdateFarmDTO, ResponseFarmDTO> {
    public Specification<Farm> createSpecification(FarmFilterDTO filterDTO);
    PageDTO<ResponseFarmDTO> findAllWithFilters(FarmFilterDTO filterDTO, Pageable pageable);
}
