package com.doa.rest_demo.controller;

import com.doa.rest_demo.model.CloudVendor;
import com.doa.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //read specific
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    //read all
    @GetMapping()
    public List<CloudVendor> getCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor deleted successfully";
    }

    //2nd delete version as an alternative
/*    @DeleteMapping(params = "vendorId") // veya sadece @DeleteMapping
    public String deleteCloudVendorDetails(@RequestParam String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor deleted successfully";
    }
 */
}
