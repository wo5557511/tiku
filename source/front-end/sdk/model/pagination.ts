/**
 * 题库外部接口
 * 题库系统供其他应用调用的接口
 *
 * OpenAPI spec version: 1.1.0
 * Contact: czfshine@outlook.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */import { BigDecimal } from './bigDecimal';


/**
 * 分页器
 */
export interface Pagination { 
    page: BigDecimal;
    size: BigDecimal;
    /**
     * 后端返回还有多少数据的
     */
    total?: BigDecimal;
}