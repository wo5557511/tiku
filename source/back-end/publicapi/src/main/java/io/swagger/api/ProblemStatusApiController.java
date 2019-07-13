package io.swagger.api;

import io.swagger.model.BasicResponse;
import io.swagger.model.ProblemIdList;
import io.swagger.model.StatusInfo;
import io.swagger.model.StatusInfoList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-12T09:08:16.977Z[GMT]")
@Controller
public class ProblemStatusApiController implements ProblemStatusApi {

    private static final Logger log = LoggerFactory.getLogger(ProblemStatusApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProblemStatusApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<StatusInfoList> getProblemStatus(@ApiParam(value = ""  )  @Valid @RequestBody ProblemIdList body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<StatusInfoList>(objectMapper.readValue("{\n" +
                        "  \"results\" : [ {\n" +
                        "    \"date\" : \"2019-08-18\",\n" +
                        "    \"unionid\" : \"xxxxxxxxxxx\",\n" +
                        "    \"poolId\" : \"4468c74d-759e-4d78-8c43-e1c5405f193b\",\n" +
                        "    \"problemId\" : \"123456\",\n" +
                        "    \"token\" : \"06e599f3-78db-4c71-b4fa-2b496beab1f6\",\n" +
                        "    \"status\" : \"错题+已解决\"\n" +
                        "  }, {\n" +
                        "    \"date\" : \"2019-08-18\",\n" +
                        "    \"unionid\" : \"xxxxxxxxxxx\",\n" +
                        "    \"poolId\" : \"4468c74d-759e-4d78-8c43-e1c5405f193b\",\n" +
                        "    \"problemId\" : \"123456\",\n" +
                        "    \"token\" : \"06e599f3-78db-4c71-b4fa-2b496beab1f6\",\n" +
                        "    \"status\" : \"错题+已解决\"\n" +
                        "  } ],\n" +
                        "  \"status\" : \"ok\"\n" +
                        "}", StatusInfoList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StatusInfoList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StatusInfoList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BasicResponse> problemStatus(@ApiParam(value = ""  )  @Valid @RequestBody StatusInfo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BasicResponse>(objectMapper.readValue("{\n" +
                        "  \"status\" : \"ok\"\n" +
                        "}", BasicResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BasicResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BasicResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}