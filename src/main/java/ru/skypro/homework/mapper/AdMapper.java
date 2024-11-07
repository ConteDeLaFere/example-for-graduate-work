package ru.skypro.homework.mapper;

import lombok.experimental.UtilityClass;
import ru.skypro.homework.dto.Ad;
import ru.skypro.homework.dto.ExtendedAd;
import ru.skypro.homework.model.AdEntity;

@UtilityClass
public class AdMapper {

    public static Ad toAdDTO(AdEntity adEntity) {
        Ad ad = new Ad();

        ad.setPk(adEntity.getId());
        ad.setAuthor(adEntity.getUser().getId());
        ad.setImage(adEntity.getImage());
        ad.setPrice(adEntity.getPrice());
        ad.setTitle(adEntity.getTitle());

        return ad;
    }

    public static ExtendedAd toExtendedAdDTO(AdEntity adEntity) {
        ExtendedAd extendedAd = new ExtendedAd();

        extendedAd.setPk(adEntity.getId());
        extendedAd.setAuthorFirstName(adEntity.getUser().getFirstName());
        extendedAd.setAuthorLastName(adEntity.getUser().getLastName());
        extendedAd.setDescription(adEntity.getDescription());
        extendedAd.setEmail(adEntity.getUser().getUsername());
        extendedAd.setImage(adEntity.getImage());
        extendedAd.setPhone(adEntity.getUser().getPhone());
        extendedAd.setPrice(adEntity.getPrice());
        extendedAd.setTitle(adEntity.getTitle());

        return extendedAd;
    }
}
