package com.ruoyi.project.business.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.business.domain.TblWorkdayCover;
import com.ruoyi.project.business.service.ITblWorkdayCoverService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 工作日-调休Controller
 * 
 * @author eagle
 * @date 2021-03-30
 */
@RestController
@RequestMapping("/business/cover")
public class TblWorkdayCoverController extends BaseController
{
    @Autowired
    private ITblWorkdayCoverService tblWorkdayCoverService;

    /**
     * 查询工作日-调休列表
     */
    @PreAuthorize("@ss.hasPermi('business:cover:list')")
    @GetMapping("/list")
    public TableDataInfo list(TblWorkdayCover tblWorkdayCover)
    {
        startPage();
        List<TblWorkdayCover> list = tblWorkdayCoverService.selectTblWorkdayCoverList(tblWorkdayCover);
        return getDataTable(list);
    }

    /**
     * 导出工作日-调休列表
     */
    @PreAuthorize("@ss.hasPermi('business:cover:export')")
    @Log(title = "工作日-调休", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TblWorkdayCover tblWorkdayCover)
    {
        List<TblWorkdayCover> list = tblWorkdayCoverService.selectTblWorkdayCoverList(tblWorkdayCover);
        ExcelUtil<TblWorkdayCover> util = new ExcelUtil<TblWorkdayCover>(TblWorkdayCover.class);
        return util.exportExcel(list, "cover");
    }

    /**
     * 获取工作日-调休详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:cover:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tblWorkdayCoverService.selectTblWorkdayCoverById(id));
    }

    /**
     * 新增工作日-调休
     */
    @PreAuthorize("@ss.hasPermi('business:cover:add')")
    @Log(title = "工作日-调休", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TblWorkdayCover tblWorkdayCover)
    {
        return toAjax(tblWorkdayCoverService.insertTblWorkdayCover(tblWorkdayCover));
    }

    /**
     * 修改工作日-调休
     */
    @PreAuthorize("@ss.hasPermi('business:cover:edit')")
    @Log(title = "工作日-调休", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TblWorkdayCover tblWorkdayCover)
    {
        return toAjax(tblWorkdayCoverService.updateTblWorkdayCover(tblWorkdayCover));
    }

    /**
     * 删除工作日-调休
     */
    @PreAuthorize("@ss.hasPermi('business:cover:remove')")
    @Log(title = "工作日-调休", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tblWorkdayCoverService.deleteTblWorkdayCoverByIds(ids));
    }
}
