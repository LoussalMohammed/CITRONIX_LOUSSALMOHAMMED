package org.CitronixFarm.citronix.Farm.controller;

import lombok.RequiredArgsConstructor;
import org.CitronixFarm.citronix.Farm.dto.request.CreateFarmDTO;
import org.CitronixFarm.citronix.Farm.dto.request.UpdateFarmDTO;
import org.CitronixFarm.citronix.Farm.dto.response.ResponseFarmDTO;
import org.CitronixFarm.citronix.Farm.entity.Farm;
import org.CitronixFarm.citronix.Farm.service.FarmService;
import org.CitronixFarm.citronix.common.controller.BaseController;
import org.CitronixFarm.citronix.common.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/farm")
public class FarmController extends BaseController<Farm, Long, CreateFarmDTO, UpdateFarmDTO, ResponseFarmDTO> {

    private final FarmService farmService;

    @Override
    protected BaseService<Long, CreateFarmDTO, UpdateFarmDTO, ResponseFarmDTO> getService() {
        return farmService;
    }

    @Override
    public Class<Farm> getEntityClass() {
        return Farm.class;
    }
}
