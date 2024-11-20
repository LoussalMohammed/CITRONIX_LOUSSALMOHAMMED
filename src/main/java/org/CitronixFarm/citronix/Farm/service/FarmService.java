package org.CitronixFarm.citronix.Farm.service;

import org.CitronixFarm.citronix.Farm.dto.request.CreateFarmDTO;
import org.CitronixFarm.citronix.Farm.dto.request.UpdateFarmDTO;
import org.CitronixFarm.citronix.Farm.dto.response.ResponseFarmDTO;
import org.CitronixFarm.citronix.common.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public interface FarmService extends BaseService<Long, CreateFarmDTO, UpdateFarmDTO, ResponseFarmDTO> {
}
