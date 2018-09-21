package com.bank.td.api;

import com.bank.td.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-09-21T10:09:39.557Z")

@Api(value = "atms", description = "the atms API")
public interface AtmsApi {

    @ApiOperation(value = "Get atms near given location", notes = "return atms near given location", response = InlineResponse200.class, tags={ "opendata_1", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "Parameters Missing", response = InlineResponse200.class),
        @ApiResponse(code = 404, message = "URL not found", response = InlineResponse200.class) })
    @RequestMapping(value = "/atms",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> 10(@ApiParam(value = "Latitude", required = true) @RequestParam(value = "lat", required = true) String lat



,@ApiParam(value = "Longitude", required = true) @RequestParam(value = "lon", required = true) String lon



) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

}
