/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_build2_24th.t12;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Table2 generated by hbm2java
 */
@Entity
@Table(name="`TABLE2`"
    ,schema="t12"
)
public class Table2  implements java.io.Serializable
 {


private Integer id;
private Table1 table1;
private Table1 table1ByColumn2;

    public Table2() {
    }



     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="table1ById"))@Id @GeneratedValue(generator="generator")

    

    @Column(name="`ID`", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.EAGER) @PrimaryKeyJoinColumn
    public Table1 getTable1() {
        return this.table1;
    }
    
    public void setTable1(Table1 table1) {
        this.table1 = table1;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`COLUMN2`", nullable=false)
    public Table1 getTable1ByColumn2() {
        return this.table1ByColumn2;
    }
    
    public void setTable1ByColumn2(Table1 table1ByColumn2) {
        this.table1ByColumn2 = table1ByColumn2;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Table2) )
		 return false;

		 Table2 that = ( Table2 ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}

