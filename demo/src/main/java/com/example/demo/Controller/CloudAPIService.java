package com.example.demo.Controller;

import com.example.demo.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController //used to create rest API
@RequestMapping("/cloudvendor") // definesthe base URL path for the API , all endpoints insde the controller will start with /cloudvendor
public class CloudAPIService {
    CloudVendor cloudVendor;
    //private CloudVendor cloudvendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        //returning cloud vendor object

        return  cloudVendor;
    }

    @PostMapping
    //we will be passing the cloud vendor object becouse the object will be reciving in the post request body itself
    public String createCloudVendorDetails(@RequestBody  CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor ;
        return "Cloud vendor has been created";

    }

    //put in http is for updating
    @PutMapping
    //we will be passing the cloud vendor object becouse the object will be reciving in the post request body itself
    public String updateCloudVendorDetails(@RequestBody  CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor ;
        return "Cloud vendor has been updated successfully ";

    }

    //
    @DeleteMapping
    //we will be deleting according to vendor id
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null ;
        return "Cloud vendor has been deleted successfully ";

    }


}
